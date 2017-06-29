package svce.svcepro;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by harishananth on 15/01/17.
 */

public class Write extends Fragment {
    String name;
    private ImageView button_send_msg;
    private TextView chat_conversation;
    private String user_name;
    private DatabaseReference root;
    private String temp_key;
    private EditText input_msg;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.writetous,null);
        root = FirebaseDatabase.getInstance().getReference().child("chat");
        button_send_msg=(ImageView)view.findViewById(R.id.send);
        input_msg=(EditText)view.findViewById(R.id.msg);
        chat_conversation=(TextView)view.findViewById(R.id.chat);
        request_user_name();
        button_send_msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<String,Object> map= new HashMap<String, Object>();
                temp_key = root.push().getKey();
                root.updateChildren(map);
                DatabaseReference message_root= root.child(temp_key);
                Map<String,Object> map2=new HashMap<String, Object>();
                map2.put("name",user_name);
                map2.put("msg",input_msg.getText().toString());

                message_root.updateChildren(map2);


            }
        });
        root.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                append_chat_conversation(dataSnapshot);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                append_chat_conversation(dataSnapshot);
            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        return view;
    }
    private void request_user_name()
    {
        AlertDialog.Builder builder= new AlertDialog.Builder(getActivity());
        builder.setTitle("Enter name:");
        final EditText input_field=new EditText(getActivity());
        builder.setView(input_field);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                name=input_field.getText().toString();

            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
                request_user_name();
            }
        });
        builder.show();

    }
    private String chat_msg,chat_user_name;

    private void append_chat_conversation(DataSnapshot dataSnapshot)
    {
        Iterator i=dataSnapshot.getChildren().iterator();
        while(i.hasNext())
        {
            chat_msg= (String) ((DataSnapshot)i.next()).getValue();
            chat_conversation.append(name +" : "+chat_msg + "\n");
            input_msg.setText("");
        }
    }

}
