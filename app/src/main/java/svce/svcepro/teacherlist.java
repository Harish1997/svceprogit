package svce.svcepro;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;

public class teacherlist extends AppCompatActivity {

    ListView listView;

    //odd sem for first year

    String[] fleeeaone = {"Technical English-I-Sam Dawsan", "Mathematics_I-R.Suresh", "Engineering Physics-I-Sambath Krishnan", "ENgineering Chemistry-I-T.Balaswami", "Computer Porgramming-A.Rohini", "Engineering graphics-Nishal/G.Kirubaran", "Computer Practise Laboratory-A.Rohini/G.Sangeetha/P.Nirmala/V.Saroja", "Engineering Practise Laboratory-K.Ram Prasad/A.Deepak/C.Kamal/S.Anita/I.Venkat Raman/", "Physics/Chemistry Lab-S.Sambath Krishnan/S.Anantha Babu", "Sports-M.Raja Lakshmi/S.Angala Vaishnavi/G.Vinoth Kumar"};

    String[] fleeebone = {"Technical English-I-Amutha Sharu Sheela", "Mathematics-I-V.Valliammal", "Engineering Physics-I-S.Hari Krishnan", "Engineering Chemistry-I-G.Devasagayan", "Computer Programming-V.M.Meghala", "Engineering Graphics-Ganeshan/Nishal", "Computer Practise Laboratory-V.M.Meghala/R.Sakhteeshwari/Silambarasi", "Engineering Practise Laboratory-Suganthi/Deepak/Sundararaman/M.Shankar/Nishal", "Physics/Chemistry Lab-S.Hari Krishan/G.Baskar", "Sports-Tamil Mani/Kamal/Suresh Kumar"};

    String[] flitaone = {"Technical English-I-Anichamalar", "Mathematics-I-R.Suresh", "Engineering Physics-I-Hari Krishnan", "Engineering Chemistry-I-T.Baluswamy", "Computer Programming-V.M.Meghala/D.Balasubramaniyam", "Engineering Graphics-A.Kumarswamy/Nishal", "Computer Practise Laboratory-V.M.Meghala/V.Saroja/Uvaraj Arathkumaran/D.Balasubramanian", "Engineering Practise Laboratory-S.Kalyanasundaram/A.Deepak", "Physics/Chemistry Lab-S.Harikrishnan/M.Thirumalaikumar", "Sports-N.Devi/S.Kalavathi/P.Sharon Femi/A.Indumathi"};

    String[] flitbone = {"Technical English-I-Sakthivel", "Mathematics-I-S.Prabhu", "Engineering Physics-I-R.Sheela", "Engineering Chemistry-I-S.Ananthababu", "Computer Programming-N.Uma/D.Balasubramnian", "Engineering Graphics-M.Maheshwaran/S.Kalyanasundaram", "Computer Practise Laboratory-N.Uma/P.Nirmala/V.Saroja", "Engineering Practise Laboratory-K.Ramprasad/M.Rajalakshmi", "Physics/Chemistry Lab-N.R.Sheela/R.Raja", "Sports-K.Krithika devi/B.T.Shobana/N.Devi/D.Jayanthi"};

    String[] flautoone = {"Technical English-I-Sam Dawson", "Mathematics-I-Vishalakshi Subramniyan", "Engineering Physics-I-N.R.Sheela", "Engineering Chemistry-I-S.Stanley", "Computer Programming-V.Ranjith", "Engineering Graphics-R.Sakthivel/A.K.Boobalasenthilraj", "Computer Practise Laboratory-V.Ranjith/A.R.Guru Gokul/V.M.Meghala/S.Uvarajarutkumar", "Engineering Practise Laboratory-R.Sakthivel/D.Amudhavalli", "Physics/Chemistry Lab-N.R.Sheela/G.Devasagayam", "Sports-R.Sakthivel"};

    String[] flbiotechone = {"Technical English-I-M.Lavanya", "Mathematics-I-A.Subha", "Engineering Physics-I-A.Anandavadivel", "Engineering Chemistry-I-S.Ananda Babu", "Computer Programming-Kiruba Wesley", "Engineering Graphics-R.Sakthivel/Ramanjaneyulu Kolla", "Computer Practise Laboratory-Kiruba Wesley/P.Leela Rani/V.Saroja", "Engineering Practise Laboratory-K.Suganthi/Nishal", "Physics/Chemistry Lab-A.Anandavadivel/S.AnandaBabu", "Sports-J.hariharan/P.Jaibiba"};

    String[] flchemaone = {"Technical English-I-Sakthivel", "Mathematics-I-N.S.Priya", "Engineering Physics-I-G.Barathy", "Engineering Chemistry-I-T.Balusamy", "Computer Programming-M.Sugacini", "Engineering Graphics-S.Kalyanasundaram/K.Ramprasad", "Computer Practise Laboratory-M.Sugacini/N.Uma/V.Saroja", "Engineering Practise Laboratory-A.SureshKumar/S.Kalyanasundaram", "Physics/Chemistry Lab-G.Barathy/T.Balusamy", "Sports-S.Swathi/P.g.Priyadarshini/D.Sivakumar"};

    String[] flchembone = {"Technical English-I-T.Ravindaran", "Mathematics-I-P.Veeraiah", "Engineering Physics-I-S.Kalpana", "Engineering Chemistry-I-S.AnandaBabu", "Computer Programming-AR.GuruGokul", "Engineering Graphics-V.Senthivelan/S.Kalyanasundaram", "Computer Practise Laboratory-AR.GuruGokul/S.UvarajArutkumaran/M.Sugacini", "Engineering Practise Laboratory-S.G.Karthick/S.Sinthamani", "Physics/Chemistry Lab-S.Kalpana/S.Stanly", "Sports-S.Swathi/P.G.Priyadarshini/D.Sivakumar"};

    String[] flcseaone = {"Technical English-I-M.Lavanya", "Mathematics-I-M.Ramya", "Engineering Physics-I-S.Harikrishnan", "Engineering Chemistry-I-S.SelvaKumar", "Computer Programming-K.S.Gayathri", "Engineering Graphics-G.Kirubaran/Ganesan", "Computer Practise Laboratory-S.RajaLakshmi/A.Sowmiya Narayanan/M.P.LakshmanaKumar/R.Bhuvaneshwari", "Engineering Practise Laboratory-S.Diraviabalan/I.Venkatraman(I/C)", "Physics/Chemistry Lab-S.hariKrishnan/G.Baskar", "Sports-K.S.Gayathri/S.Senthmizhselvi/S.Rajalakshmi"};

    String[] flcsebone = {"Technical English-I-T.Murugavel", "Mathematics-I-Vishalakshi Subramanian", "Engineering Physics-I-S.Kalpana", "Engineering Chemistry-I-S.SelvaKumar", "Computer Programming-J.Gunasekar", "Engineering Graphics-M.Kalaimani/K.Ramprasad", "Computer Practise Laboratory-R.bhuvaneshwari,K.S.Gayathru,M.P.Lakshmanakumar,R.Jayabhaduri", "Engineering Practise Laboratory-Ganesan,C.Kamal(I/C)", "Physics/Chemistry Lab-S.Kalpana/G.Devasagayam", "Sports-R.Bhuvaneshwari/M.P.Lakshmana Kumar/R.Jayabhaduri"};

    String[] flcsecone = {"Technical English-I-S.Anichamalar", "Mathematics-I-T.Kulandaivel", "Engineering Physics-I-G.Barathy", "Engineering Chemistry-I-S.SelvaKumar", "Computer Programming-P.Janardhanan", "Engineering Graphics-S.Muniraj/S.Kalyanasundaram", "Computer Practise Laboratory-K.S.Gayathri,M.P.LakshmanaKumar,S.Rajalakshmi,A.Sowmiya Narayanan", "Engineering Practise Laboratory-Ganesan/S.Tamilmani(I/C)", "Physics/Chemistry Lab-G.Bharathy/N.Nachiyappan", "Sports-P.Janarthanan/D.Sasikala/A.Sowmynarayan"};

    String[] flcivilone = {"Technical English-I-Sakthivel", "Mathematics-I-M.Ramya", "Engineering Physics-I-G.Bharathy", "Engineering Chemistry-I-R.Raja", "Computer Programming-E.Sakthivel", "Engineering Graphics-V.Tamizhselvi,G.Arun", "Computer Practise Laboratory-E.Sakthivel,Kiruba Wesley,R.Saktheeswari,V.M.Megala", "Engineering Practise Laboratory-S.Diraviabalan/I Venkatraman(I/C)", "Physics/Chemistry Lab-G.Bharathy/T.Balusamy", "Sports-C.Sandhiya"};


    String[] fleceaone = {"Technical English-I-S.B.Lavanya", "Mathematics-I-S.Prabhu", "Engineering Physics-I-N.R.Sheela", "Engineering Chemistry-I-N.Nachiappan", "Computer Programming-U.Poornima", "Engineering Graphics-E.Suresh/R.Ganesan", "Computer Practise Laboratory-U.Pornima,P.Sharon Femi,V.Ranjith,P.Nirmala", "Engineering Practise Laboratory-C.Kamal(I/C)/R.Ganesan", "Physics/Chemistry Lab-N.R.Sheeela/S.Stanly", "Sports-S.Reethi/S.Sangeethapriya"};


    String[] flecebone = {"Technical English-I-R.Premraj", "Mathematics-I-N.S.Priya", "Engineering Physics-I-K.Raju", "Engineering Chemistry-I-N.Nachiyappan", "Computer Programming-A.Indumathi", "Engineering Graphics-V.Sridharan/Nishal", "Computer Practise Laboratory-A.Indumathi,V.Ranjith,V.Saroja", "Engineering Practise Laboratory-K.Ramprasad", "Physics/Chemistry Lab-K.Raju/S.Stanly", "Sports-N.Santhish,A.Bharathipriya"};


    String[] flececone = {"Technical English-I-C.Amutha Charu Sheela", "Mathematics-I-Visalkshi Subramanian", "Engineering Physics-I-A.Anandavadival", "Engineering Chemistry-I-N.Nachiyappan", "Computer Programming-C.Silambarasi", "Engineering Graphics-M.Mohandass/V.Sridharan", "Computer Practise Laboratory-C.SilambarasiV.Saroja,S.Uvaraj Aruthkumar(I/C)", "Engineering Practise Laboratory-S.Kalyana Sundaram/A.Sureshkumar(I/C)", "Physics/Chemistry Lab-A.Anandavadivel,T.Balusamy", "Sports-S.Nithya/G.Loganathan"};

    String[] flmechaone = {"Technical English-I-Ganapathi", "Mathematics-I-A.Suba", "Engineering Physics-I-K.Raju", "Engineering Chemistry-I-R.Raja", "Computer Programming-N.Uma", "Engineering Graphics-M.Prem Ananth/V.Senthilvelan", "Computer Practise Laboratory-N.Uma,V.Saroja,AR.Guru Gokul,R.Sakhteeshwari", "Engineering Practise Laboratory-R.Sakthivel/D Amudhavalli (I/C)", "Physics/Chemistry Lab-K.Raja/R.Raja", "Sports-G.Kirubakaran/M.Arulkumar/R.Ganesan"};

    String[] flmechbone = {"Technical English-I", "Mathematics-I", "Engineering Physics-I", "Engineering Chemistry", "Computer Programming", "Engineering Graphics", "Computer Practise Laboratory", "Engineering Practise Laboratory", "Physics/Chemistry Lab", "Sports"};


    Integer r, x, y, z, t, d;

    //below is the teachers list for first year second sem
    //method used - (fl)+(dept)+(section if available)+(semester)

    String[] flautotwo = {"Technical English-II-Mr.Sakthivel", "Mathematics-II-Dr.S.Prabhu", "Engineering Physics-II-Ms.S.Kalpana", "Engineering Chemistry-II-Dr.G.Baskar", "Basic Electrical and Electronics Engg-Mr.G.Vinothkumar", "Engineering mechanics-Dr.V.Ganesh/Mr.K.Paul Durai", "Computer Aided Drafting and Modeling Laboratory-Mr.R.Sakthivel/Mr.E.Ravindar Rao/Mr.A.K.Boobala Senthilraj/Mr.K.E.Kumaraguru", "Physics and Chemistry Laboratory-II-Ms.S.Kalpana/Dr.G.Baskar", "Library-Mr.A.K.Boobala Senthilraj"};
    String[] flbiotechtwo = {"Technical English-II-Ms.Lavanya", "Mathematics-II-Ms Visalakshi Subramanian", "Physics of Materials-Ms.S.Kalpana", "Chemistry of Technologists-Dr.M.Thirumalaikumar", "Biochemistry-Dr.S.Prabhu", "Microbiology-Ms.P.Jaibiba", "Biochemistry Laboratory-Ms.Pandi Prabha", "microbiology Laboratory-Ms.P.Jaibiba,Library-Mr.N.Sathish"};
    String[] flchematwo = {"Technical English-II-Mr.Sakthivel", "Mathematics-II-Dr.D.Meiyappan", "Engineering Physics-II-Mr.S.Harikrishnan", "Engineering Chemistry-II-Dr.S.Selvakumar", "Basic Electrical and Electronics Engineering-Mr.SV.Sreeraj", "Engineering Mechanics-Dr.K.E.K.Vimal", "Computer Programming Laboratory-Ms.Sharon Ranjitha Esther/Ms.U.Poornima/Ms.A.Indhumathi/Mr.Sakthivel/Ms.Kiruba Wesley", "Basic Electrical and Electronics Laboratory-Mr.SV Sreeraj/Ms.S.Angala Vaihnavi", "Physics and Chemistry Laboratory-II-Mr.S.Harikrishnan/Dr.S.Selvakumar"};
    String[] flchembtwo = {"Technical English-II-Ms.Lavanya", "Mathematics-II-Ms.Visalakshmi Subramanian", "Engineering Physics-II-Dr.N.R.Sheela", "Engineering Chemistry-II-Dr.S.Selvakumar", "Basic Electrical and Electronics Engineering-Ms.S.Angala Vaishnavi", "Engineering Mechanics-Mr.R.Ganesan", "Computer Programming Laboratory-Ms.C.Silambarasi/Ms.M.Sugacini/Ms.S.Jerusha/Ms.N.Uma", "Basic Electrical and Electronics Laboratory-Mr.SV Sreeraj/Ms.S.Angala Vaihnavi", "Physics and Chemistry Laboratory-II-Mr.S.Harikrishnan/Dr.S.Selvakumar"};
    String[] flciviltwo = {"Technical English-II-Dr.Amutha Charu Sheela", "Mathematics-II-Ms.A.Subha", "Engineering Physics-II-Dr.K.Raju", "Engineering Chemistry-II-Ms.B.Preetha", "Basic Electrical and Electronics Engineering-Dr.R.Karthikeyan", "Engineering Mechanics-Ms.K.Sathya Priya/Ms.Ruby Freya(Tut)", "Computer Aided Drafting and Modeling Laboratory-Ms.K.Sathya Priya/Ms.C.Sandhiya", "Physics and Chemistry Laboratory-II-Dr.K.Raju/Ms.B.Preetha", "Library-Mr.G.Arun"};
    String[] flcseatwo = {"Technical English-II-Dr.T.Murugavel", "Mathematics-II-Ms.A.Subha", "Engineering Physics-II-Dr.N.R.Sheela", "Engineering Chemistry-II-Dr.N.Nachiappan", "Digital Principles and System Design-Mr.A.Sowmyanarayanan", "Programming and Data Structures-I-Ms.S.Rajalakshmi", "Digital Laboratory-Mr.A.Sowmyanarayanan/Ms.E.Rajalakshmi/Ms.S.U.Muthunagai", "Programming and Data Structures Laboratory-I-Ms.S.Rajalakshmi/Ms.S.Poorani/Ms.K.S.Gayathri", "Physics and Chemistry Laboratory-II-Dr.N.R.Sheela/Dr.T.Balusamy", "Library-Mr.S.Yuvaraj"};
    String[] flcsebtwo = {"Technical English-II-Ms.S.Anichamalar", "Mathematics-II-Mr.P.Veeriah", "Engineering Physics-II-Ms.G.Bharathy", "Engineering Chemistry-II-Dr.N.Nachiappan", "Digital Principles and System Design-Ms.E.Rajalakshmi", "Programming and Data Structures-I-Ms.J.M.Gnanasekar", "Digital Laboratory-Ms.E.Rajalakshmi/Ms.R.Bhuvaneswari", "Programming and Data Structures Laboratory-I-Ms.U.Abirami/Ms.S.Poorani/Ms.S.K.Umamaheswari", "Physics and Chemistry Laboratory-II-Mr.S.Harikrishnan/Dr.R.Raja", "Library-Mr.S.Yuvaraj"};
    String[] flcsectwo = {"Technical English-II-Mr.PremRaj", "Mathematics-II-Dr.S.Prabhu", "Engineering Physics-II-Dr.A.Anandavadivel", "Engineering Chemistry-II-Dr.G.Baskar", "Digital Principles and System Design-Mr.R.Bhuvaneswari", "Programming and Data Structures-I-Ms.U.Abirami", "Digital Laboratory-Mr.A.Sowmyanarayanan/Ms.R.Bhuvaneswari/Ms.K.Kumanan(C2)", "Programming and Data Structures Laboratory-I-Ms.U.Abirami/Ms.S.Rajalakshmi/Ms.S.U.Umamaheswari", "Physics and Chemistry Laboratory-II-Dr.A.Anandavadivel/Dr.G.Baskar", "Library-Ms.D.Sasikala"};
    String[] fleceatwo = {"Technical English-II-Mr.Sam Dawson", "Mathematics-II-Ms.M.Ramya", "Engineering Physics-II-Dr.S.Sampath Krishnan", "Engineering Chemistry-II-Dr.M.Thirumalai Kumar", "Electronic Devices-Mr.S.R.Balasubramanian/Ms.T.J.Jeyaprabha(T-Tutorial)", "Circuit Theory-Ms.R.Kousalya/Ms.S.R.Malathi(T1-Tutorial 1)/Ms.A.Bharathipriya(T2-Tutorial2)", "Circuit and Devices Laboratory-Mr.M.H.Masood/Ms.Rajeswari Ramaraj/Mr.G.Loganathan/Mr.N.Sathish", "Physics and Chemistry Laboratory-II-Dr.S.Sampath Krishnan/Dr.N.Nachiappan", "Library-Mr.P.Arul"};
    String[] flecebtwo = {"Technical English-II-Ms.Anichamalar", "Mathematics-II-Mr.R.Suresh", "Engineering Physics-II-Ms.G.Bharathy", "Engineering Chemistry-II-Dr.G.Devasagayam", "Electronic Devices-Mr.S.Saravanan/Mr.S.R.Balasubramanian(T-Tutorial)", "Circuit Theory-Mr.K.Varadarajan/Ms.K.Srividhya(T1-Tutorial 1)/Mr.N.Kumaran(T2-Tutorial2)", "Circuit and Devices Laboratory-Ms.B.Sarala/Mr.P.Muthukumaran/Mr.M.Duraisamy/Ms.A.Bharathipriya", "Physics and Chemistry Laboratory-II-Ms.G.Bharathy/Dr.G.Devasagayam", "Library-Mr.B.Nethaji"};
    String[] flecectwo = {"Technical English-II-Mr.R.Premraj", "Mathematics-II-Dr.T.Kulandaivel", "Engineering Physics-II-Mr.S.HariKrishnan", "Engineering Chemistry-II-Ms.B.Preetha", "Electronic Devices-Mr.A.Bharathipriya/Ms.T.J.Jeyaprabha(T-Tutorial)", "Circuit Theory-Ms.B.Sarala/Ms.K.srividhya(T1-Tutorial 1)/Ms.A.Bharathipriya(T2-Tutorial2)", "Circuit and Devices Laboratory-Ms.B.Sarala/Ms.S.M.Mehzabeen/Mr.B.Nethaji/Mr.A.BharathiPriya", "Physics and Chemistry Laboratory-II-Mr.S.HariKrishnan/Dr.T.Balusamy", "Library-Mr.R.Nagaraj"};
    String[] fleeeatwo = {"Technical English-II-Mr.Ganapathy", "Mathematics-II-Dr.T.Kulanthaivel", "Engineering Physics-II-Dr.N.R.Sheela", "Engineering Chemistry-II-Dr.S.Ananda Babu", "Basic Civil and Mechanical Engineering-Mr.G.Kirubakaran/Ms.C.Sandhiya", "Circiut Theory-Ms.S.Arulmozhi", "Computer Programming Laboratory-Mr.V.Ranjith/Ms.J.Sharon Ranjitha Esther/Ms.A.Rohini/Ms.A.Indumathi", "Electric Circuits Laboratory-Ms.S.Arulmozhi(I/C),Ms.S.Anitha,Mr.C.kamal,Ms.A.Deepak", "Physics and chemistry Laboratory-II-Dr.N.Sheela/Dr.N.Nachiappan"};
    String[] fleeebtwo = {"Technical English-II-Mr.Sam Dawson", "Mathematics-II-Dr.D.Meiyappan", "Engineering Physics-II-Dr.K.Raju", "Engineering Chemistry-II-Dr.T.Balu samy", "Basic Civil and Mechanical Engineering-Mr.G.Kirubakaran/Ms.S.Diravia Balan", "Circiut Theory-Ms.A.Tamizhselvan", "Computer Programming Laboratory-Ms.V.M.Megala/Mr.J.Sharon Ranjitha Esther/Ms.V.Ranjith/Mr.E.Sakthivel", "Electric Circuits Laboratory-Ms.A.Tamizhselvan(I/C),Ms.S.Anitha,Mr.C.kamal,Ms.K.S.Pavithra", "Physics and chemistry Laboratory-II-Dr.S.Harikrishnan/Dr.T.Balu Samy"};
    String[] flitatwo = {"Technical English II-Mr.P.Sakthivel","Mathematics-II-Mr.P.Veeraiah","Engneering Physics-II-Ms.S.Kalpana","Engineering Chemistry-II-Dr.R.Raja","DPSD-Dr.C.Yaashuwanth","PDS-I-Ms.U.Pooranima","Digital Laboratory-Dr.C.Yaashuwanth/MS.V.M.Meghala/Ms.M.Sugacini/Mr.V.Ranjith","PDS Lab I-Ms.U.Pooranima/Ms.K.Krithika Devi/Ms.S.Kalavathi/Ms.D.Jayanthi","Phy and Chem Lab II-Ms.S.Kalpana/Dr.R.Raja","Library-Ms.V.M.Meghala"};
    String[] flitbtwo = {"Technical English II-Dr.T.Ravindran","Mathematics II-Ms.Visalakshi Subramanian","Engineering Physics II-Dr.A.Anandhavadivel","Engineering Chemistry II-Dr.R.Raja","DPSD -Mr.K.Suresh","PDS I-Ms.L.Anita Elizabeth","Digital Lab-Mr.K.Suresh/Mr.V.Ranjith/Mr.AR.Guru Gokul/Ms.M.Sugacini","PDS I-Ms.L.Anita Elizabeth/Ms.P.Nirmala/Ms.A.Kala/Ms.P.Sharon Femi"};
    String[] flmechatwo = {"Technical English II-Dr.Amutha Charu Sheela","Mathematics II-Ms.N.Priya","Engineering Physics II-Ms.G.Bharathy","Engineering Chemistry II-Dr.S.AnandaBabu","BEEE-Mr.I.Venkatraman","Engineering Mechanics-Dr.M.Premananth","Computer Aided Drafting and Modeling Lab-Mr.M.Kalaimani/Mr.E.Suresh/Mr.R.Ganesan/Mr.J.Sivaramapandian","Phy and Chem Lab II-Ms.G.Bharathy/Dr.S.AnandaBabu","Library-Dr.M.Ananth Kumar"};
    String[] flmechbtwo = {"Technical English II-Ms.Lavanya","Mathematics II-Dr.V.Valliammal","Engineering Physics II-Dr.A.Bhaskaran","Engineering Chemistry II-Dr.T.Balaswamy","BEEE-Mr.I.Venkatraman","Engineeering Mechanics-Ms.S.Muniraj","Computer Aided Drafting and Modelling Lab-Dr.S.Kalyansundaram/Mr.M.ArulKumar/Mr.M.Maheswaran/Ms.S.Muniraj","Phy and Chem Lab II-Dr.A.Bhaskaran/Dr.S.AnandabaBabu","Library-Dr.M.Mohandass"};
    //below is d teachers list for second yr ,third yr and fourth year

    //method used - (fl)+(dept)+(section if available)+(semester)

    String[] flautofour = {"Statistics and numerical methods-Mr.R.Suresh", "Applied thermodynamics and heat transfer-Mr.A.Balasubramanian/Dr.J.Venkatesan", "Engineering materials and metallurgy-Dr.S.Kaliyanasundaram", "Electronics and microprocessor-Ms.S.Reethi", "Automotive Chassis-Mr.A.Boobalasenthilraj", "CAD/CAM Lab-Mr.K.Paul durai/Mr.A.K.Boobalasenthilraj/Mr.R.Ramajaneyulu Kolla", "Electronics and microprocessors Lab-Ms.S.Reethi", "Strength of materials lab-Mr.S.Premanth/Mr.K.E.Kumaraguru "};
    String[] flautosix = {"Automotive Engine Components Design-Mr.K.E.Kumaraguru/Mr.A.Balasubranian", "Automotive Chassis Components Design-Mr.E.Ravindar rao/Mr.G.Ravi", "Two and three wheelers-Mr.G.Ravi", "Vehicle dynamics-Mr.R.Sakthivel/Dr.V.Ganesh", "Principles of management-Mr.J.Dhanabal", "Alternative fuel and energy system-Mr.K.Paul Durai", "Computer Aided Engine and Chassis Design Lab-Mr.E.Ravindar rao/Mr.G.Ravi", "Two anf three wheelers lab-Mr.J.Dhanabhal/Mr.R.Ramanjaneyulu Kolla/Mr.A.K.Boobalasenthilraj", "Library-Mr.k.Paul Durai", "Placement-1-Mr.Ramajaneyulu Kolla", "Placement-2-Mr.K.E.Kumaraguru", "Placement-3-Mr.E.Ravindar rao", "Seminar-Mr.R.Sakthivel"};
    String[] flautoeight = {"Vehicle body engineering-Mr.Ramanjaneyulu Kolla", "Transport management-Dr.J.Venkatesan", "Project work-Mr.R.Sakthivel", "Project work-Mr.R.Sakthivel", "Project work-Dr.V.Ganesh"};
    String[] flbiotechfour = {"Probability and Statistics-Dr.A.R.Vijayalakshmi/AM Faculty(T)", "Analytical methods and instrumentation-Ms.S.Pandi Prabha", "Applied thermodynamics for biotechnologists-Mr.P.k.Praveen Kumar/Dr.Ashok palaniyappan", "Heat transfer operations-Ms.V.Sumitha/Prof.Nalikanth V.Ghone(T)", "Enzyme Technology and Biotransformation-Mr.D.Sureshh Kumar/Ms.S.Naga Vignesh(T)", "Bioprocessors Principles-Dr.Ashok Palaniyappan/Mr.P.K.Praveen Kumar(T)", "Chemical engineering lab-Mr.P.K.Praveen Kumar", "Instrumentation Methods Of Analysis lab-Dr.S.Prabhu", "Library-Ms.N.Kanagam/Mr.N.Sathish", "Seminar-Prof.Solochana Somasundaram"};
    String[] flbiotechsix = {"Totl Quality Management For Biotechnologists-Ms.N.kanagam", "Immunology-Prof.R.B.Narayanan", "Genetic Engineering And Geonics-Mr.J.Hariharan", "Chemical Reaction Engineering-Prof.Nalinkanth V.Ghone/Ms.V.Sumitha(T)", "Molecular Pathogenesis Of Infectious disease-Prof.Sulochana Somasundaram", "Cancer Biology and Therapeutics-Mr.N.Sathish", "Plant Bioitechnology-Dr.Ashok Palaniyappan", "Metabolic Engineering-Mr.S.Naga Vignesh/Mr.D.Suresh Kumar(T)", "Genetic engineering lab-Mr.N.Sathish", "Bioprocess lab II-Ms.V.Sumitha", "Employability Skills Lab-Dr.C.Amutha Charu Sheela", "Library-Mr.D.Suresh Kumar/Ms.S.Pandi Prabhu", "Seminar-Dr.S.Prabhu"};
    String[] flbiotecheight = {"Project work-prof.E.Nakeeran", "Library-Dr.Ashok Palaniappan"};
    String[] flchemafour = {"Probability and Satistics-Dr.B.Thilaka", "chemical Process Industries I-Ms.G.Saraswathi", "Chemical Engineering Thermodynamics I-Dr.D.Swaminathan", "Chemical Process Calculations-Ms.S.Swathi", "Mechanical Operations-Dr.N.Meyyapan", "Environmental Science and Engineering-Mr.B.S.Vishal", "Technical Analysis Lab-Dr.M.Thirumalaikumar", "Fluid Mechanics lab-Ms.S.Swathi/Mr.S.Rajesekar", "Library-Mr.S.Bharathi"};
    String[] flchemasix = {"Energy engineering-mr.B.S.Vishal", "Chemical Reaction Engineering I-Dr.C.Anandbabu", "Mass transfer II-Dr.R.Palani", "Materials Science and Technology-Dr.M.Yogesh Kumar", "Process Instrumemtation Dynamics and Control-Mr.N.arun Prem Anand", "Food Technology-Ms.G.Thayanidhi", "Air Pollution and Control-Mr.S.Rajasekar", "Green Chemistry and Engineering-Ms.P.G.Priya Darshini", "Waste Water Treatment-Ms.S.Swathi", "heat transfer lab-Ms.A.C.Vijyalakshmi/Dr.M.yogesh Kumar", "Process Equipment Design II-Mr.B.S.Vishal/Ms.G.Thayanidhi", "Mass Transfer Lab-Dr.R.Palani/Ms.G.Saraswathi", "Library-Ms.G.Sudha"};
    String[] flchemaeight = {"Petroleum Technology-Mr.S.Jaiganesh", "Process Plant utilites-Mr.S.Bharath", "project Practice-Aspen plus Training-Mr.N.Arunpremanand/Mr.S.Jaiganesh", "Project work-Dr.R.Govindaarasu/Mr.B.S.Vishal"};
    String[] flchembfour = {"Probability and Statistics-Dr.R.Umadevi", "Chemical Process Industries I-Ms.G.Thayanidhi", "Chemical Engineering Thermodynamics I-Ms.P.G.Priya Darshini", "Chemical Process Calculation-Dr.M.Yogesh Kumar", "Mechanical Operations-Mr.S.Jai Ganesh", "Environmental Science and Engineering-Mr.D.Siva Kumar", "Technical Analysis lab-Ms.B.Preetha", "Fluid Mechanics lab-Mr.D.Siva Kumar/Mr.n.Arun PremAnand", "Library-Ms.D.Duragevi"};
    String[] flchembsix = {"Energy Engineering-Mr.D.SivaKumar", "Chemical Reaction Engineering I-Ms.G.Saraswathi", "Mass Transfer II-Ms.G.Sudha", "Materials and technology-Ms.D.Durga Devi", "Process Insrumentation Dynamics and Control-Dr.R.Govindarasu", "Food Technology-Ms.G.Thayanidhi", "Air Pollution And Control-Mr.S.Rajasekar", "Green Chemistry And Engineering-Ms.P.G.Priya Darshini", "Waste Water Treatment-Ms.S.Swathi", "Heat Transfer Lab-Dr.R.Govindarasu/Ms.D.Durgadevi", "Process Equipment Design II-Dr.D.S.Swaminathan/Ms.P.G.Priyadarshini", "Mass Transfer lab-Ms.G.Sudha/mr.S.Bharath", "Library-Ms.G.Thayanidhi"};
    String[] flchembeight = {"Petroleum Technology-Ms.A.C.Vijayalakshmi", "Process Plant Utilities-Ms.D.Durgadevi", "Project Practice-Aspen Plus Training-mr.N.ArunPremAnand/Ms.S.Jaiganesh", "Project work-Dr.R.Govindarasu/Ms.G.Sudha"};
    String[] flcivilfour = {"Numerical Methods-Dr.R.Muthucumaraswamy", "Construction Materials-Mr.K.Arun", "Strengh Of Materials-Dr.P.Venkateswararao/Ms.K.Sathyapriya(T)", "Applied Hydraulic Engineering-Mr.S.Diraviabalan/Dr.P.Venkateswararao(T)", "Surveying-II-Mr.R.Gopalakrishnan", "Soil Mechanics-Ms.C.Sandhya", "Strength Of Materials lab-Ms.Ruby Freya/Dr.P.Venkateswararao", "Hydraulic Engineering Lab-Mr.S.Diravia Balan/Ms.C.Santhyapriya", "'Survey Practical II-Mr.K.Arun/Mr.G.Arun"};
    String[] flcivilsix = {"Design Of Reinforced Concrete and Brick Masonry Structures-Mr.G.Kumar", "Structural Analysis II-Mr.R.Gopalakrishnan/Ms.Ruby Freya(T)", "Design of Steel Structures-Ms.Ruby Freya/Mr.K.SathyaPriya(T)", "Railway,Airport and Harbour Engineering-Dr.M.Selvakumar", "Environmental Engineering II-Dr.E.Ravindranath", "Construction planning and Sheduling-Dr.v.Tamizhselvi", "Environmental Engineering Lab-Mr.R.Mathiyazhagan", "Concrete and Higher Engineering lab-Dr.V.Tamizhselvi/Dr.M.Selvakumar", "Library-Ms.C.Sandhya"};
    String[] flcivileight = {"Principles Of Management-Mr.G.Arun", "Prefabricated Structures-Mr.G.Kumar", "Repair and Rehabilitation of Structures-Mr.R.Mathiyazhagan", "Project work-All Faculties"};
    String[] flcseafour = {"Probability and Queuing Theory-Dr.G.Satheesh Kumar", "Computer Networks-Ms.S.U.Muthunagai", "Operating Systems-Dr.P.Janarthanan", "Design of Analysis Of Algorithms-Ms.G.Janakasudha", "Microprocessor and Microcontroller-Mr.C.S.Saroj", "Software Engineering-Ms.S.Poorani", "Networks Lab-Ms.S.Senthamizhselvi And Ms.S.U.Muthunagai", "Microprocessor and Microcontroller Lab-Ms.B.Nethaji /Mr.G.Loganthan", "Operating Systems Lab-Ms.V.Rajalakshmi &Ms.D.Sasikala", "Library-Ms.N.Revathi"};
    String[] flcseasix = {"Distributed Systems-Ms.R.Gayathri", "Mobile Computing-Mr.K.Srinivasan", "Compiler Design-Dr.V.Vidya", "Digital signal processing-Dr.Gayathri", "Digital signal processing(Tut)-Dr.R.Gayathri & Ms.P.Madhumitha", "Artificial Intelligence-Ms.K.S.Gayathri", "Datawarehousing and Data Mining-Dr.T.K.Thivakram", "Mobile Application Dev Lab-Ms.K.Srinivasan/Ms.B.Lalithambigai/Ms.N.Ravethi(A1)/Ms.T.Rajasekar(A2)", "Compiler Lab-Ms.G.Janakasudha/Ms.T.Padmavathy", "Communication and Soft Skill Lab-Mr.P.Ganapathy/Dr.T.Ravindran"};
    String[] flcseaeight = {"Multi-Core Architecture and programming-Ms.D.Ssasikala", "Professional Ethics and Engineering-Mr.K.Kumanan", "Knowledge Management-Ms.R.Iyswarya", "Project work-Mr.N.M.Balamurugan", "Library-Dr.S.P.Manikandan"};
    String[] flcsebfour = {"Probability and Queuing Theory-Ms.M.Ramya", "Computer Networks-Ms.S.Senthamizhselvi", "Operatinn systems-Dr.R.Anitha", "Design of Analysis Of Algorithms-Ms.T.Padmavathy", "Microprocessor and microcontroller-Mr.M.P.Lakshmanakumar", "Software engineering-Ms.S.K.Umamaheswari", "Networks Lab-Ms.S.Senthaizhselvi/Mr.M.Adimoolam", "Microprocessor and Microcontroller Lab-Mr.B.Nethaji &Mr.P.Arul"};
    String[] flcsebsix = {"Distributed Systems-Mr.K.Kumanan", "Mobile Computing-Ms.B.Lalithambigai", "Compiler Design-Dr.V.Vidhya", "Digital signal processing-Ms.K.Thayalnayaki", "Digital signal processing(Tut)-Dr.R.Gayathri & Ms.K.Thayalnayaki", "Artificial Intelligence-Dr.R,Jayabhauri", "Datawarehousing and Data Mining-Mr.M.P.lakshmanakumar", "Mobile Application Dev Lab-Ms.B.Lalithambigai,Mr.S.Yuvaraj,Ms.N.Revathi(B2),Mr.T.Rajasekar(B1)", "Compiler Lab-Mr.T.Kumaran,Ms.T.Padmavathy", "Communication and Soft Skill Lab-Mr.P.Ganapathy/Dr.T.Ravindran"};
    String[] flcsebeight = {"Multi-Core Architecture and programming-Ms.V.Rajalakshmi", "Professional Ethics and Engineering-Mr.N.Balamurugan", "Knowledge Management-Ms.R.SenthilKumar", "Project work-Ms.R.Jayabhaduri", "Library-Dr.P.Janarthanan"};
    String[] flcsecfour = {"Probability and Queuing Theory-Dr.M.Radhakrishnan", "Computer Networks-Mr.M.Adhimoolam", "Operating Systems-Dr.S.P.Manikandan", "Design of Analysis Of Algorithms-Ms.N.Rajeswari", "Microprocessor and Microcontroller-Mr.C.S.Sanoj", "Software Engineering-Mr.T.Rajasekar", "Networks Lab-Mr.M.Adhimoolam And Mr.N.M.Balamurugan", "Microprocessor and Microcontroller Lab-Ms.S.M.Mehjabeen & Mr.N.Sathish", "Operating Systems Lab-Ms.R.Iyswarya,Ms.D.Sasikala(C1),Ms.K.S.Gayathri(C2)", "Library-Mr.N.M.Balamurugan"};
    String[] flcsecsix = {"Distributed Systems-Mr.R.SenthilKumar", "Mobile Computing-Dr.C.Jayakumar", "Compiler Design-Mr.T.Kumaran", "Digital signal processing-Ms.P.Mathumitha", "Digital signal processing(Tut)-Ms.P.Mathumitha & Ms.K.Thayalnayaki", "Artificial Intelligence-Dr.R,Jayabhauri", "Datawarehousing and Data Mining-Dr.R.Nedunchelian", "Mobile Application Dev Lab-Mr.K.Srinivasan,Mr.T.Rajasekar,Ms.N.Revathi(C2)", "Compiler Lab-Mr.T.Kumaran,Ms.G.Janakasudha", "Communication and Soft Skill Lab-Ms.Anichamalar/Ms.P.Ganapathy"};
    String[] flcseceight = {"Multi-Core Architecture and programming-Ms.N.Revathi", "Professional Ethics and Engineering-Dr.S.P.Manikandan", "Knowledge Management-Ms.R.Gayathri", "Project work-Dr.r.Anitha", "Library-Mr.r.Senthilkumar"};
    String[] fleceafour = {"Probability and Random Processes-Dr.V.valliyammal", "Electronics Circuuits II-Ms.S.Nandhini", "Communication Theory-Ms.S.M.Mehzabeen", "Electromagnetic Fields-Ms.B.Hemalatha,Ms.P.Muthukumaran(Tut)", "Line Integrated Circuits-Ms.B.Sarala", "Control System Engineering-Mr.M.K.Varadarajan", "Circuits and Simultation Integrated Lab-Mr.M.Duraisamy,Mr.N.Kumaran", "Linear Integrated Circuit Lab-Mr.M.Duraisamy,Mr.n.Kumaran", "Electrical Engineering and Control System Lab-Mr.S.Tamizmani(I/C),Mr.S.Sethuraman,Mr.A.Suresh Kumar"};
    String[] fleceasix = {"Principles Of Management-Mr.S.P.Sivagnana Subramanian", "Computer Architecture-Ms.S.Sangeethapriya", "Computer Networks-Ms.T.J.Jeyapriya", "VLSI Design-Ms.M.Anushya", "Antenna and Wave Propagation-Ms.K.Srividhya", "Medical Electronics-Mr.M.Duraisamy", "Computer Networks Lab-Mr.S.P.Sivagnana Subramanian,Ms.S.Sangeethapriya", "VLSI Design Lab-Ms.M.Anushya,Ms.P.Mathumitha", "Communication and Soft Skills Lab-Dr.T.Murugavel,Mr.R.Premraj", "Library-Mr.N.Kumaran"};
    String[] fleceaeight = {"Wireless Communication-Ms.S.Radhika", "Wireless Networks-Mr.n.Sathish", "Professional Ethics in Engineering-Dr.H.Umma Habiba", "Toal Quality Management-Mr.S.Senthil Rajan", "Project Work-Ms.D.Menaka", "Project-Ms.S.Reethi/Ms.D.Menaka/Mr.P.Arul/Ms.S.Sangeethapriya", "Library-Mr.S.Sangeethapriya"};
    String[] flecebfour = {"Probability and Random Process-Dr.B.Thilaka", "Electronic Circuits II-Ms.C.Gomatheeswari Preethika", "Communication theory-Mr.B.Nethaji", "Electromagnetic Fields-Mr.P.Muthukumaran,Ms.Rajeswari Ramaraj(Tut)", "Linear Integrated Circuits-Ms.L.Anju", "Control System Engineering-Ms.S.Kalyani", "Circuits and Simulation Integrated lab-Ms.C.Gomatheeswari Preethika,Mr.N.Sathish", "Linear integrated Circuit Lab-Ms.L.Anju,Ms.A.Bharathipriya", "Electrical Engineering and Control System lab-Mr.G.Vinoth Kumar(I/C),Mr.T.Annamalai,Mr.m.Ranjithkumar"};
    String[] flecebsix = {"Principles Of Management-Ms.S.Radhika", "Computer Architecture-Ms.C.Gomatheeswari Preethika", "Computer Networks-Ms.G.Padmavathi", "VLSI Design-Ms.S.R.Malathi", "Antenna and Wave Propagation-Dr.P.Jothilakshmi", "Medical Electronics-Mr.S.Nandhini", "Computer Networks Lab-Mr.S.Radhika,Ms.S.Sangeethpriya", "VLSI Design Lab-Ms.S.Kalyani,Mr.M.K.Varadarajan", "Communication and Soft Skills Lab-Dr.Amutha Charu Sheela,Ms.S.B.Lavanya", "Library-Ms.K.Srividhya"};
    String[] flecebeight = {"Wireless Communication-Dr.P.Jothilakshmi", "Wireless Networks-Dr.G.A.Sathish Kumar", "Professional Ethics in Engineering-Mr.P.Arul", "Toal Quality Management-Mr.S.Sivagana Subramanian", "Project Work-Ms.S.Reethi", "Project-Ms.A.BharathiPriya,Ms.D.Menaka,Mr.M.Duraisamy,Ms.S.Reethi", "Library-Mr.N.Kumaran"};
    String[] flececfour = {"Probability and Random Process-Ms.K.Vijayalakshmi", "Electronic Circuits II-Ms.K.Anushya", "Communication Theory-Ms.D.Menaka", "Electromagnetic Fields-Ms.Rajeeswari Ramaraj/Ms.B.Hemalatha(Tut)", "Linear Integrated Circuits-Mr.G.Loganthan", "Control System Engineering-Ms.R.Kousalya", "Circuits and Simulation Integrated lab-Mr.G.Loganthan/Ms.S.Reethi", "Linear integrated Circuit Lab-Ms.D.Menaka/Ms.R.Kousalya", "Electrical Engineering and Control System lab-Mr.M.Rajalakshmi(I/C),Mr.C.Venakatesan,Mr.S.Sudharsanam"};
    String[] flececsix = {"Principles Of Management-Ms.L.Anju", "Computer Architecture-Dr.S.MuthuKumar", "Computer Networks-Mr.S.Saravan", "VLSI Design-Mr.M.Athappan", "Antenna and Wave Propagation-Mr.P.Arul", "Medical Electronics-Ms.M.Vidya", "Computer Networks Lab-Mr.S.Saravanan,Mr.M.Duraisamy", "VLSI Design Lab-Mr.M.Athappan,Ms.P.Madhumitha", "Communication and Soft Skills Lab-Dr.T.Murugavel,Mr.Sam Dawson", "Library-Ms.A.Bharathipriya"};
    String[] flececeight = {"Wireless Communication-Ms.Rajeswari Ramaraj", "Wireless Networks-Mr.N.Kumaran", "Professional Ethics in Engineering-Ms.S.Kalyani", "Toal Quality Management-Mr.M.H.Masood", "Project Work-Ms.A.BharathiPriya", "Project-Ms.A.BharathiPriya,Ms.S.Sangeethapriya,Mr.T.J.Jeyapriya,Ms.C.Gomatheeswari Preethika", "Library-Mr.M.H.Masood"};
    String[] fleeeafour = {"Numerical Methods-Dr.M.Radhakrishnan", "Electrical Methods I-Mr.D.Purushothaman", "Transmission and Distribution-Mr.A.Deepak", "Dicrete Time Systems and Signal processing-Dr.Nalin Kant Mohanty", "Measurements and Instrumetnation-Ms.M.Rajalakshmi", "Object oriented programming -Mr.suresh kumar", "Electrical machines laboratory - Mr.D S purushothaman,Ms.M Rajalakshmi,Mr. vinothkumar,Mr V Mohanraj", "seminar - Mr. S Thamizhmani", "Central library - Ms. S anitha"};
    String[] fleeeasix = {"Communication Engineering - Mr. A suresh kumar", "Solid state Drives-Ms. K suganthi", "embedded systems-Ms K Pavithra", "Power system operation and control-Mr. M Shankar", "design of electrical machines-Mr M.Ranjith kumar", "Visual langugage and applications-Mr.S Yuvaraj", "Power electronics and drivers laboratory-Ms. K Suganth,Mr M Sankar", "Microprocessor and microcontroller - Ms.K Pavithra,Dr,Sudhakar bhartan", "Presentation skills and technical seminar - Ms. s Arulmozhi,Ms K suganthi", "Central library-Mr.A Suresh kumar"};
    String[] fleeeaeight = {"Electric Energy Generation,Utilization and conservation- Mr. T Annamalai", "power Electronics for renewable energy Systems- Ms.D Amudhavalli ", "professional Ethics oin ENgineering - Mr C Kamal", "Project work - Mr. T annamalai", "Central library - Mr.V Mohanraj", "Seminar - Mr. S Tamizmani"};
    String[] fleeebfour = {"Numerical methods- Dr. B saravanan", "Electrical machines-I Ms S sasikala", "Tranasmission and distribution - Dr.M Gopalakrishnan", "Discrete Time Systems and Signal Processing- Dr.Sudhakar K bharatan", "Measurements nad instrumentation - Dr, KR.Santha", "Object oriented programming- Ms.p Vinothiyalakshmi", "Electrical MSchines Lboratory-I - Ms.Sasikala,Mr.M Sankar,Ms. S Arulmozhi,Mr. S thamailmani", "OOPS lab - Ms. P vinothiyalakshmi,Mr M suresh kumar", "Seminar - Ms D Amudhavalli", "Central Library - Mr. Sudharsanam"};
    String[] fleeebsix = {"communication Engineering - Ms S Anitha", "Solid state drives - Dr. K Sundaraman", "Embeded Systems - Mr. V Manoharan", "Power System operation and control - Mr S G Bharathidasan", "Design of electrical machines - Mr S sudharsanam", "optimisation techniques - Mr S Thanmizmani", "power electronics and drives laboratory - Ms D amudhavalli , Mr S  Sethuraman , Mr. D S Purushothaman", "Microprocessor and micro controller laboratory - Mr . V Mohanraj , Dr. S G bharathidasan", "Presentation skills and technical seminar - Mr SureshKumar , Mr G vinothkumar", "Central library - Mr s thamizmani"};
    String[] fleeebeight = {"Electric enery generation Utilization and conservation - Mr S sethuraman", "Power Electronics for renewable ENergy systems - Mr C Venkatesan", "Project Work - Mr. T Annamalai", "Central library - Mr C VEnkatesan", "Seminar - Mr A Deepak"};
    String[] flitafour = {"Probability and ququing theory - Dr B Saravanan", "Microprocessor and microcontroller - Ms V saroja, Mr V rajaram", "Design and analysis of algorithms - Ms B T Shobana , Ms R Saktheeswari", "operating systems - Ms A kala , Mr T sukumar", "Software engineering - Mr v ranjith,Mr S uvaraj Arutkumaran", "Microprocessor and microcontroller laboratory - Ms V saroja , Ms M sugacini, Mr T sukumar/Mr V ranjith", "Operating systems laboratory - Ms A Kala , Ms K Kiruthika Devi ,MS B T shobana", "Software engineering laboratory - Mr E shakthivel, MS N Devi, MS R .shaktheeswari/MS Kiruba Wesley", "Library -  MS M sugacini"};
    String[] flitasix = {"Distributed Systems - Ms P.Nirmala", "Mobile Computing - MS S jerusha", "Artificial intelligence - Ms N Uma", "Compiler Design - Ms A Rohini", "Software archetecture - MS J Sharon ranjitha Ester ", "TOtal Quality Management - Mr Shakthivel", "Mobile appication development laboratory - MS S jerusha , ms D jayanthi , Ms L Anitha Elizabeth/MS U poorima", "Compiler LAboratory - Ms A Rohini, Ms  P leela Rani,Ms A indumathi", "Communication and softskills laboratory - Mr sam Dawson, Dr Amutha Charu Sheela", "Library - MS N devi"};
    String[] flitaeight = {"Service oriented Archetecture - Ms N devi , Ms D jayanthi ", "Professoional ethics(elctive 3) - MS V M Sivagami , Dr D balasubramanian", "Cyber Forensics (elecive 4) - Dr D Balasubramanian , Mr AR gurugokul , MR V ranjith ", "Software project management - Ms P leela Rani , Ms V.M Megala", "Project Work - Ms P Sharon femi", "Library - Ms A Indumathi "};
    String[] flitbfour = {"Probability and ququing theory - Ms N.S Priya", "Microprocessor and microcontroller - Ms V saroja(tutorial), Mr V rajaram", "Design and analysis of algorithms - M B T Shobana , Ms R Saktheeswari", "operating systems - Ms A kala (tutorial), Mr T sukumar", "Software engineering - Mr AR gurugokul ,Mr S uvaraj Arutkumaran", "Microprocessor and microcontroller laboratory - Mr V Rajaram , Mr K suresh, Mr AR GuruGokul", "Operating systems laboratory - Mr T Sukumar  , Ms G Sangeetha , MS R saktheeswari", "Software engineering laboratory - Mr S Uvaraj Arunkumaran , Ms P Nirmala , MS VM Sivagami / MS A indumathi", "Library -  MS B T Shobana"};
    String[] flitbsix = {"Distributed Systems - Ms G Sangeetha", "Mobile Computing - MS S Kiruba Wesley", "Artificial Intelligence - Ms P sharon Femi", "Compiler Design - Ms S kalavathi", "Software archetecture - MS C Silambarasi", "TOtal Quality Management - MS K kiruthika Devi", "Mobile appication development laboratory - MS Kiruba Wesley , Ms C Silambarasi , Ms G Sangeetha", "Compiler LAboratory - Ms S Kalavathi, Ms P Sharon Femi ,Ms N uma", "Communication and softskills laboratory - DR T ravichandran, Ms Anichamalar", "Library - P leela Rani"};
    String[] flitbeight = {"Service oriented Archetecture - Ms N devi(Tutorial) , Ms D jayanthi ", "Professoional ethics(elctive 3)-Dr.N Kumarathan , VM SIvagami", "Cyber Forensics (elecive 4) - Mr V Ranjith , Mr AR gurugokul ", "Software project management - Ms P leela Rani , Ms V.M Megala", "Project Work - Ms S kalavathi", "Library - Mr S Uvraj Arunkumaran "};
    String[] flmechafour = {"Statistics and Numerical Methods-Ms.K.Vijayalakshmi", "Kinematics Of Machinery-Mr.G.Saravanaram/Dr.N.Muthukrishnan(Tut)", "Manufacturing Technology II-Dr.M.AnanthKumar", "Engineering Materials and Metallurgy-Mr.M.Mohandass", "Environmental Science and Engineering-Mr.S.Bharath", "Thermal Engineering-Dr.S.Saravanan/Mr.G.Logachandar", "Manufacturing Technology laboratory II-Dr.M.AnanthKumar/Mr.M.Kalaimani/Mr.M.Gajendiran/Mr.K.Ramprasad", "Thermal Engineering Laboratory I-Mr.S.Natarajan(1)/Mr.R.Kaliyanasunder", "Strength Of Materials laboratory I-Dr.K.E.K.Vimal/Mr.S.Muniraj/Dr.M.Mohandass/Mr.k.Karthee", "Seminar/Lab-Mr.M.ArulKumar"};
    String[] flmechasix = {"Design Of Transmissionsystems-prof.S.Ramesh/Mr.J.Sivaramapandian(Tut)", "Principles of Management-Dr.S.Kalyanasundaram", "Automobile Engineering-Mr.M.Arulkumar", "Finite Element Analysis-Mr.E.Suresh/Mr.C.Senthamaraikannan(Tut)", "Gas Dynamics and Jet Propulsion-Mr.S.Arumugan/Mr.P.Raghu(Tut)", "Renewable Sources of Energy-Mr.V.Sridharan", "Marketing Management-Mr.S.Yeswanthraj", "Unconventional Machining Process-Mr.M.Nishal", "C.A.D./C.A.M.Laboratory-Mr.M.Maheswaran(i)/Mr.G.Kirubakaran(i),Mr.R.Ganesan/Mr.M.Nishal", "Design and Fabriction project-Dr.S.Ilaiyavel/Mr.V.Senthil Velan", "Communication Skills Lab-Mr.S.Sakthivel/Mr.R.Premraj"};
    String[] flmechaeight = {"Engineering Economics-Mr.K.Ram Prasad", "Entrepreneurship Development-Mr.V.Senthilvelan", "Operations Research-Mr.M.Maheswaran", "Advanced I.C.Engines-Mr.G.Suresh", "Additive Manufacturing-Dr.K.S.Badrinathan", "Project Work-Dr.N.Muthukrishnan/Mr.K.Ramprasad/Mr.M.Nishal"};
    String[] flmechbfour = {"Statistics and Numerical Methods-Dr.R.Umadevi", "Kinematics Of Machinery-Dr.N.Muthukrishnan/Mr.G.Saravanaram(Tut)", "Manufacturing Technology II-Dr.S.Ponnuvel", "Engineering Materials and Metallurgy-Dr.S.Ilayavel", "Environmental Science and Engineering-Mr.S.Stanley", "Thermal Engineering-Mr.R.Kaliyanasunder,Dr.S.Saravanan(Tut)", "Manufacturing Technology laboratory II-Mr.S.Ponnuvel/Mr.K.Ramprasad", "Thermal Engineering Laboratory I-Mr.M.Gajendiran(1)/Mr.G.Logachandar", "Strength Of Materials laboratory I-Mr.V.Sridharan(1)/Mr.G.Loganchar/Mr.S.Yeswanthraj", "Seminar/Lab-Mr.M.Gajendiran"};
    String[] flmechbsix = {"Design Of Transmissionsystems-Mr.J.Sivarampandian/Prof.S.Ramesh", "Principles of Management-Dr.Mr.M.Nishal", "Automobile Engineering-Mr.Dr.T.Raja", "Finite Element Analysis-Mr.C.Senthamaraikannan/Mr.E.Suresh", "Gas Dynamics and Jet Propulsion-Mr.P.Raghu/Mr.S.Arumugam", "Renewable Sources of Energy-Mr.V.Sridharan", "Marketing Management-Mr.S.Yeshwanth Raj", "Unconventional Machining Processes-Dr.R.Ramesh", "C.A.D./C.A.M.Laboratory-Mr.G.Saravanaram/Mr.M.Maheswaran/Mr.R.Ganesan/Mr.k.Ramprasad", "Design and Fabriction project-Mr.S.Gopinath/Mr.A.Kumarawamy", "Communication Skills Lab-Mr.Samuel Sudharasan Dawson/Mr.R.Premraj"};
    String[] flmechbeight = {"Engineering Economics-Dr.S.Ramesh babu", "Entrepreneurship Development-Mr.S.Gopinath", "Operations Research-Mr.M.Maheswaran", "Advanced I.C.Engines-Mr.G.Suresh", "Additive Manufacturing-Dr.K.S.Badrinath", "Project Work-Dr.N.Muthukrishnan/Mr.K.Ramprasad/Mr.M.Nishal"};


    //odd sem of second year and third year and fourth year


    String[] flautothree = {"Automotive Engines-Dr.J.Venkatesan", "Mathematics III-Dr.J.Valliammal", "Engineering Thermodynamics-Mr.A.Balasubramanian/Mr.A.K.Boobalasenthilraj", "Engineering Materials and Metallurgy-Mr.K.E.Kumaraguru", "Mechanics of solids-Dr.S.Premnath/Dr.V.Ganesh", "Manufacturing Technology-Mr.Ramanjaneyulu Kolla", "Engine Performance and System Testing Lab-Drt.V.Ganesh/Mr.G.Ravi", "Strength of materials lab-Mr.S.Premanth/Mr.A.Balasubramanian ","Manufacturing Technology Lab-Mr.J.Dhanabal/Mt.K.E.Kumaraguru"};
    String[] flautofive = {"Automotive Transmission-Mr.K.E.Kumaraguru", "Automotive Electrical and Electronics System-Mr.A.K.Boobalasenthilraj", "Vehicle Design and Data Characteristics-Mr.R.Sakthivel/Mr.E.Ravindar Rao", "Automotive Fuels and Lubricants-Mr.K.Paul Durai", "Environmental Science and Engineering-Mrs.C.Sandhiya", "Design of Machine Elements-Mr.J.Dhanabal/Mr.E.Ravindar Rao", "Automotive Electrical and Electronics Lab-Mr.K.E.Kumaraguru/Mr.A.K.Boobalasenthilraj/Mr.S.Saravanan/Mr.M.Duraisamy", "Automotive Fuels and Lubricants Lab-Mr.Ramanjaneyulu Kolla/Mr.R.Sakthivel","Communication Skills Lab-Mr.Sakthivel/Mr.R.Premraj","Library-Mr.A.K.Boobalasenthilraj"};
    String[] flautoseven = {"New Generation and Hybrid Vehicles-Mr.R.Ramanjaneyulu Kolla","Automotive Aerodynamics-Mr.J.Dhanbal","Automotive Safety-Mr.G.Ravi","Engine and Vehicle Management System-Mr.R.Sakthivel","Vehicle Maintenance-Mr.K.Paul Durai","Automotive Pollution and Control-Mr.A.K.Boobalasenthilraj","Finite Element Analysis-Dr.V.Ganesh/Mr.Ramanjaneyulu Kolla","Engine Performance and Emission Testing Lab-Mr.G.Ravi/Mr.A.K.Boobalasenthilraj/Mr.K.Paul Durai","Vehicle Maintenance Lab-Dr.S.Premnath/Mr.E.Ravindar Rao","Library-Mr.A.K.Boobalasenthilraj","Placement-Mr.G.Ravi","Project Work I-Mr.E.Ravindar Rao","Project Work II-Dr.V.Ganesh"};
    String[] flbiotechthree = {"Transforms and Partial Differential Equations-Dr.R.Uma Devi//1 AM Faculty (T) ","Stoichiometry and Process Calculations-Ms.V.Sunitha/Mr.P.K.Praveen Kumar (T)","Bioorganic Chemistry-Mr.N.Sathish/Dr.S.Prabhu (T)","Cell Biology-Mr.S.Naga Vignesh/Ms.P.Jaibiba (T)","Basic Industrial Biology-Ms.N.Kanagam","Environmental Science and Engineering-Dr.Senthil Nagappan","Cell Biology Lab-Ms.P.Jaibiba/Mr.J.Hariharan","Bioorganic Chemistry Lab-Ms.S.Pandi Prabha","Library-Ms.P.Jaibiba","Seminar-Ms.V.Sunitha"};
    String[] flbiotechfive = {"Protein Structure Function and Proteomics-Mr.S.Naga Vignesh/Dr.P.D.Deepak (T)","Bioprocess Engineering-Dr.P.D.Deepak/Ms.V.Sunitha (T)","Molecular Biology-Dr.Sulochana Somasundaran","Biophysics-Dr.Senthil Nagappan","Principles of Food Processing-Ms.P.Jaibiba","Biopharmaceutical Technology-Dr.S.Pandi Prabha","Bioprocess Lab-I-Ms.N.Kanagam/Mr.D.Suresh Kumar","Molecular Biology Lab-Mr.N.Sathish/Mr.P.K.Praveen Kumar","Library-Mr.N.Sathish","Seminar-I-Dr.Sulochana Somasundaram","Seminar-II-Dr.R.B.Narayanan"};
    String[] flbiotechseven = {"Bioinformatics and Computational Biology-Mr.P.K.Praveen Kumar/Mr.S.Naga Vignesh (T)","Downstream Processing-Dr.E.Nakkeeran/Mr.D.Suresh Kumar (T)","Creativity,Innovation and New Product Development-Dr.SenthilNagappan","Bioconjugate Technology and Applications-Mr.J.Hariharan","Bio Industrial Entrepreneurship-Mr.N.Sathish","Tissue Engineering-Dr.R.B.Narayanan","Neurobiology and Cognitive Sciences-Dr.S.Prabhu","Downstream Processing Lab-Mr.D.Suresh Kumar/Ms.V.Sunitha","Immunology Lab-Dr.Sulochana Somasundaram/Mr.N.Sathish","Bioinformatics lab-Mr.P.K.Praveen Kumar/Dr.P.D.Deepak","Library-Mr.D.Suresh Kumar","Seminar-Dr.S.Prabhu","Project Planning-Dr.E.Nakkeeran"};
    String[] flchemathree = {"Mathematics III-Dr.S.Prabhu","Electrical Drives And Control-Mr.G.Vinoth Kumar","Organic Chemistry-DrM.Thirumalaikumar","Mechanics of Solids for Chemical Engineering-Dr.M.Yogesh Kumar","Physical Chemistry-Ms.B.Preetha","Fluid Mechanics-Ms.G.Saraswathi","Organic Chemistry Lab-Dr.G.Thirumalaikumar","Physical Chemistry Lab-Ms.P.G.Priyadarshini"};
    String[] flchemafive = {"Numerical Methods-Dr.R.Muthucumarasamy","Instrumental Methids of Analysis-Dr.G.Baskar","Chemical Process Industries-II-Mr.D.Sivakumar","Chemical Engineering ThermodynamicsII-Mr.S.Rajasekar","Heat Transfer-Dr.R.Govindarasu","Mass Transfer-I-Dr.Nalinikanth V Ghone","Xommunication Skills Lab-Ms.Anichamalar/Dr.T.Ravindran","Process Equipment Design I-Mr.D.Sivakumar/Dr.M.Yogesh Kumar","Mechanical Operations Lab-Mr.S.Jaiganesh/Ms.G.Thayanidhi"};
    String[] flchemaseven = {"Chemical Reaction Engineering-II-Ms.A.C.Vijayalakshmi","Transport Phenomena-Mr.S.Jaiganesh","Chemical Process Plant Safety-Dr.N.Meiyyappan","Process Economics-P.G.Priyadarshini","Biochemical Engineering-Dr.D.Swaminathan","Fertiliser Technology-Ms.G.Sudha","Modern Seperation Process-Ms.S.Swathi","Chemical Reaction Engineering Lab-Ms.A.C.Vijayalakshmi/Mr.S.Bharath","Seminar and Comrehension-Dr.R.Palani","Process Control Lab-Dr.R.Govindarasu/Dr.P.G.Priyadarshini"};
    String[] flchembthree = {"Mathematics III-Ms.N.Priya","Electrical Drives And Control-Ms.S.Angalavaishnavi","Organic Chemistry-Dr.M.Thirumalaikumar","Mechanics of Solids for Chemical Engineering-Mr.S.Bharath","Physical Chemistry-Ms.B.Preetha","Fluid Mechanics-Dr..C.Anand Babu","Organic Chemistry Lab-Dr.M.Thirumalaikumar","Physical Chemistry Lab-Ms.B.Preetha","Library-Mr.D.Sivakumar"};
    String[] flchembfive = {"Numerical Methods-Dr.T.Kulandaivel","Instrumental Methods of Analysis-Dr.G.Baskar","Chemical Process Industries II-Ms.P.G.Priyadarshini","Chemical Engineering Thermodynamics II-Ms.G.Thayanidhi","Heat Transfer-Ms.S.Swathi","Mass Transfer I-Dr.R.Palani","Communication Skills Lab-Mr.P.Ganapathy/Ms.Anichamalar","Process Equipment Design I-Mr.B.S.Vishal/Ms.G.Saraswathi","Mechanical Operations Lab-Ms.S.Swathi/Dr.D.Swaminathan"};
    String[] flchembseven = {"Chemical Reaction Engineering II-Ms.D.Durgadevi","Transport Phenomena-Mr.N.Arunpremanand","Chemical Process Plant Safety-Mr.D.Sivakumar","Process Economics-Mr.B.S.Vishal","Biochemical Engineering-Ms.G.Saraswathi","Fertiliser Technology-Ms.G.Sudha","Modern Seperation Process-Ms.S.Swathi","Chemical Reaction Engineering Lab-Ms.D.Durgadevi/Ms.G.Sudha","Seminar and Comprehension-Dr.Nalinikanth V Ghone","Process Control Lab-Mr.S.Rajasekar/Mr.N.Arunpremanand"};
    String[] flcivilthree = {"Strength of Materials I-Dr.P.Venkateswara Rao/Ms.K.SathyaPriya","Mechanics of Fluids-Mr.S.Diravia Balan/Dr.P.Venkateswara Rao","Surveying I-Mr.R.GopalaKrishnan","Engineering Geology-Mr.K.Arun","Construction Materials-Ms.K.SathyaPriya","Mathematics III-Dr.B.Saravanan","Strength of Materials Lab-Mr.K.Arun/Mr.R.GopalaKrishnan","Computer Aided Building Drawing-Mr.G.Arun/Ms.K.SathyaPriya","Library-Mr.K.Arun","Seminar-Dr.P.Venkateswara Rao"};
    String[] flcivilfive = {"Structural Analysis I-Mr.R.Mathiyazhagan/Mr.G.Kumar","Foundation Engineering-Ms.C.Sandhya","Environmantal Engineering I-Dr.E.Ravindranath","Highwa Engineering-Dr.M.Selvakumar","Design of Reinforced Concrete Elements-Mr.G.Kumar","Construction Techniques and Equipment Practice-Mr.K.Arun","Soil Mechanics Lab-Mr.R.GopalaKrishnan/Mr.C.Sandhya","Survey Camp-Mr.R.GopalaKrishnan","Communication Skills Lab-Dr.Amutha Charu Sheela","Seminar-Mr.R.GopalaKrishnan","Library-Mr.R.Mathiyazhagan"};
    String[] flcivilseven = {"Traffic Engineering and Management-Dr.M.Selvakumar","Structural Dynamics and Earthquake Engineering-Dr.P.Venkateswara Rao","Processed Concrete Structures-Dr.V.Tamizhselvi","Water Resources and Irrigation Engineering-Mr.G.Kumar","Estimation and Quantity Surveying-Mr.G.Arun","Municipal Solid Waste Management-Mr.R.Mathiyazhagan","Computer Aided Design and Drafting Lab-Mr.G.Kumar/Ms.K.SthyaPriya","Design Project-All Faculty","Technical Skills-Dr.M.Selvakumar","Quantitative and SAptitude-Mr.G.Arun","Library-Mr.G.Kumar"};
    String[] flcseathree = {"Mathematics III-Ms.Visalakshi Subramanian","Programming and Data Structures II-Ms.T.Padmavathy","Operating Systems-Ms.D.Sasikala","Microprocessor and Microcontroller-Mr.M.P.Lakshmanakumar","Analog and Digital Communication-Mr.G.Loganathan","Environmantal Science and Engineering-Mr.D.Suresh Kumar","Programming and Data Structures Lab II-Ms.T.Pdmavathy,Ms.N.Rajeswari,Mr.M.P.LakshmanaKumar(A1)","Seminar 1-Ms.K.S.Gayathri","Seminar 2-Mr.M.Adimoolam","Seminar 3-Ms.E.Rajalakshmi","Library-Ms..Padmavathy"};
    String[] flcseafive = {"Discrete Mathematics-Dr.B.Thilaka","Internet Programming-Mr.K.Srinivasan","Object Oriented Analysis and Design-Dr.CJayakumar","Theory of Computation-Mr.C.S.Sanoj","Computer Graphics-Ms.E.Rajalakshmi","Case Tools Lab-Ms.S.Senthamizhselvi,Dr.P.Janarthanan(A1),Mr.C.S.Sanoj(A2)","Internet Programming Lab-Mr.K.Srinivasan & Mr.T.Rajasekar","Computer Graphics Lab--Ms.E.Rajalakshmi & N.M.Balamurugan","Internet Programming (Tutorial)-Ms.K.Srinivasan & Dr.J.M.Gunasekar","Seminar 1-Ms.K.S.Gayathri","Seminar 2-Mr.M.Adimoolam","Seminar 3-Ms.E.Rajalakshmi","Library-Ms.T.Padmavathy"};
    String[] flcseaseven={"Cryptogtaphy and Network Security-Mr.M.Suresh Kumar","Graph Theory and Applications-Ms.U.SAbirami","Grid and Cloud Computing-Ms.P.Vinothiya Lakshmi","Resource Managament Techniques-Dr.R.Nedunchelian","Ad hoc and Sensor Networks-Dr.N.Kumaratharan","Information Retrieval-Dr.R.Jayabhaduri","Security Lab-Mr.M.Suresh Kumar,Mr.M.Adimoolam","Grid and cloud Computing Lab-Ms.P.Vinothiya Lakshmi & Ms.R.Gayathri","Seminar 1-Mr.S.Yuvaraj","Seminar 2-Ms.P.Vinothiya Lakshmi","Seminar 3-Ms.S.K.Umamaheswari","Seminar 4-Ms.S.K.Umamaheswari","Library-Mt.C.S.Sanoj"};
    String[] flcsebthree = {"Mathematics III-Dr.R.Umaevi","Programming and Data Structure Lab II-Ms.N.Rajeswari","Operating Syatems-Dr.R.Anita","Microprocessor and Microcontroller-Mr.B.Praveen Kumar","Analog and Digital Communication-Ms.A.Bharathi Priya","Environmental Science and Engineering-Ms.N.Kanagam","Programming and Data Structures Lab II-Ms.T.Padmavathy,Ms.G.Janakasudha","Operating Systems Lab-Mr.B.Praveen Kumar, Ms.D.Sasikala(B2),Mr.P.Selvamani","Microprocessor and Microcontroller Lab-Ms.S.K.Subhashini,Ms.A.Bharathipriya","Library-Ms.R.Ishwarya"};
    String[] flcsebfive = {"Discrete Mathematics-Dr.S.Prabhu","Internet Programming-Dr.J.M.Gunasekar","Object Oriented Analysis and Design-Ms.S.Senthamizhselvi","Theory of Computation-Mr.C.S.Sanoj","Computer Graphics-Dr.N.M.Balamurugan","Internet Programming(Tutorial)-Dr.J.M.Gunasekar and Ms.J.Buvana","Cse Tools Lab-Ms.S.Senthamizhselvi & Dr.P.Janarthanan","Internet Programming Lab-Mt.T.Rajasekar,Ms.J.Buvana(B1),Mr.R.Senthilkumar(B2)","Computer Graphics Lab-Dr.N.M.Balamurugan & Ms.R.Bhuvaneswari(B1),MsS.Rajalakshmi(B2)","SEminar 1-Ms.S.Rajalakshmi","Seminar 2-Mr.T.Rajasekar","Seminar 3-Mr.M.P.Lakshmanakumar","Library-Mr.T.Rajsekar"};
    String[] flcsebseven = {"Cryptogtaphy and Network Security-Mr.M.Adimoolam","Graph Theory and Applications-Mr.T.Rajasekar","Grid and Cloud Computing-Ms.R.Gayathri","Resource Management Techniques-Dr.R.Nedunchelian","Ad hoc and Sensor Networks-Dr.S.P.Manikandan","Information Retrieval-Dr.R.Jayabhaduri","Security Lab-Mr.M.Adimoolam & Mr.R.Kumaran","Grid and Cloud Computing Lab-Ms.R.Gayathri & Ms.R.Ishwarya","Seminar 1-Ms.D.Sasikala","Seminar 2-Mr.S.Yuvaraj","Seminar 3-Dr.P.Janarthanan","Seminar 4-Mr.M.Suresh Kumar","Library-Mr.P.Lakshmana Kumar"};
    String[] flcsecthree = {"Mathematics III-Ms.K.Vijayalakshmi","Programming and Data Structures II-Mr.T.Kumaran","Operating Systems-Ms.V.Rajalakshmi","Microprocessor and Microcontroller-Mr.A.Sowmyanarayanan","Analog and Digital Communication-Mr.R.Nagaraj","Environmental Science and Engineering-Mr.G.Arun","Programming and Data Structures Lab II-N.Rajeswari & Mr.M.P.Lakshmana Kumar","Operating Systes Lab-Ms.V.Rajalakshmi & Mr.B.Praveen Kumar(C),Ms.D.Sasikala(C2)","Microprocessor and Microcontroller Lab-Ms.C.Gomatheeswari Preethika, Mr.R.Nagaraj","Library-Ms.S.U.Muthunagai"};
    String[] flcsecfive = {"Discrete Mathematics-Dr.A.R.Vijayalakshmi","Internet Programming-Ms.J.Buvana","Object Oriented Analysis and Design-Mr.S.Yuvaraj","Theory of Comptation-Mr.P.Selvamani","Computer Graphics-Ms.R.Bhuvaneswari","Internet Programming(Tutorial)-Ms.J.Buvana & Mr.K.Srinivasan","Case Tools Lab-Mr.S.Yuvaraj & Ms.U.Abirami","Internet Programming Lab-Ms.J.Buvana,Mr.K.Srinivasan(C1) & Mr.R.Senthilkumar(C2)","Computer Graphics Lab-Ms.R.Bhuvaneswari(C1),Ms.S.Rajalakshmi(C2),Ms.E.Rajalakshmi","Seminar 1-Ms.E.Rajalakshmi","Seminar 2-Ms.R.Gayathri","Seminar 3-Mr.S.Yuvaraj","Library-Mr.B.Praveen Kumar"};
    String[] flcsecseven = {"Cryptography and Network Security-Mr.K.Kumaran","Graph Theory and Applicatons-Ms.S.Rajalakshmi","Grid and cloud Computing-Ms.R.Ishwarya","Resource Management Techniques-Ms.N.Revathi","Ad hoc and sensor Networks-Mr.R.SenthilKumar","Information Retrieval-Ms.G.Janakasudha","Security Lab-Mr.K.Kumanan & Mr.A.Sowmyanarayanan","Grid and Cloud Computing Lab-Ms.R.Ishwarya & Ms.P.Vijayalakshmi","Seminar 1-Mr.M.Suresh Kumar","Seminar 2-Ms.J.Buvana","Seminar 3-Mr.K.Srinivasan","Seminar 4-Ms.S.U.Muthunagai","Library-Mr.M.Suresh Kumar"};
    String[] fleceathree = {"Mathematics III-Ms.K.Vijayalakshmi","Electrical Engineering and Instrumentation-Ms.S.Angaa Vaihnavi","Programming and Data Structures-Ms.S.Poorani","Digital Electronics-Mr.M.K.Varadarajan","Electromagnetic Fields-Dr.H.Umma Habiba","Electronic Circuits I-Mr.P.Venkatesh","Digital Electronics Lab-Mr.M.K.Varadarajan,Mr.N.Kumaran","Analog Circuits Lab-Ms.M.Vidya,Mr.P.Venkatesh","Programming and Data Structures Lab-Ms.S.Poorani,Ms.S.K.Umamaheswari","Library-Mr.M.K.Varadarajan"};
    String[] fleceafive = {"Digital Communication-Mr.S.R.Balasubramanian","Principles of Digital Signal Processing-Ms.S.Kalyani,Ms.M.Vidya (T)","Transmission Lines and waveguides-Ms.C.Gomatheeswari Preethika,Ms.B.Hemalatha (T)","Microprocessor and Microcontroller-Mr.B.Nethaji","Environmental Science and Engineering-Mr.S.Bharath","Digital Signal Processing Lab-Ms.L.Anju,Mr.P.Paul","Communication System Lab-Mr.S.R.Balasubramanian,Ms.C.Gomatheeshwari Preethika","Microprocessor and Microcontroller Lab-Mr.B.Nethaji,Ms.N.Rekha","Library-Ms.R.Kousalya","Seminar-1.Ms.N.Rekha,2.Mr.N.Sathish,3.Ms.S.M.Mehzabeen"};
    String[] fleceaseven = {"RF and Microwave Engineering-Mr.S.Saravanan", "Optical Communication and Networks-Dr.R.Gayathri", "Embedded and Real Time Systems-Mr.N.Kumaran", "Satellite Communication/Digital Image Processing(Elective-II)-Ms.S.Radhika/Ms.L.Anju", "Advanced Computer Architecture-Mr.M.Athappan", "Embedded Lab-Mr.M.K.Varadharajan, Mr.M.Athappan/Ms.S.Kalyani", "Optical and Microwave Lab-Mr.S.Saravanan,Mr.R.Nagaraj", "Library-Mr.R.Nagaraj", "Seminar-Ms.S.Reethi,Mr.M.H.Masood,Ms.N.Rekha,Ms.M.Anushya"};
    String[] flecebthree = {"Mathematics III-Dr.M.Radhakrishnan", "Electrical Engineering and Instrumentation-Ms.M.Rajalakshmi", "Programming and Data Structures-Ms.S.U.Muthunagai", "Digital Electronics-Ms.D.Menaka", "Electromagnetic Fields-Mr.M.Duraisamy", "Electronic Circuits-I-Mr.N.Sathish", "Digital Electronics Lab-Ms.S.Radhika,Ms.N.Rekha", "Programming and Data Structures Lab-Ms.S.U.Muthunagai,Ms.S.Poorani", "Library-Mr.M.Duraisamy"};
    String[] flecebfive = {"Digital Communication-Ms.G.Padmavathi", "Principles of Digital Signal Processing-Ms.B.Sarala,Ms.S.Kalyani(T)", "Transmission Lines and Waveguides-Ms.B.Hemalatha,Mr.P.Muthukumaran(T)", "Microprocessor and Microcontroller-Dr.S.R.Malathi", "Environmental Science and Engineering-Dr.M.Yogesh Kumar", "Digital Signal Processing Lab-Ms.B.Sarala,Mr.N.Sathish", "Communication System Lab-Ms.B.Hemalatha,Mr.M.H.Masood", "Microprocessor and Microcontroller Lab-Mr.B.Nethaji,Mr.N.Kumaran", "Library-Mr.R.Nagaraj", "Seminar-Mr.P.Venkatesh,Mr.N.Kumaran,Ms.S.Sangeethapriya"};
    String[] flecebseven = {"RF and Microwave Engineering-Ms.S.Sangeethapriya", "Optical Communication and Networks-Mr.M.H.Masood", "Embedded and Real Time Systems-Ms.S.Reethi", "Satellite Communication-Ms.K.Srividhya", "Advanced Computer Architecture(Elective-IV)-Mr.P.Arul", "Embedded Lab-Ms.S.Reethi,Ms.A.Bharathipriya", "Optical and Microwave Lab-Mr.M.H.Masood,Ms.S.Sangeethapriya", "Library-Mr.G.Loganathan", "Seminar-Mr.P.Arul,Ms.A.Bharathipriya,Ms.S.Sangeethapriya,Mr.P.Venkatesh"};
    String[] flececthree = {"Mathematics III-Mr.R.Suresh", "Electrical Engineering and Instrumentation-Mr.S.Thamizmani", "Programming and Data Structures-Ms.S.K.Umamaheswari", "Digital Electronics-Ms.R.Kousalya", "Electromagnetic Fields-Ms.Rajeswari Ramaraj", "Electronic Circuits-I-Ms.M.Anushya", "Digital Electronics Lab-Ms.Rajeswari Ramaraj,Mr.S.P.Sivagnana Subramanian/Ms.B.Sarala", "Analog Circuits Lab-Ms.M.Anushya,Mr.M.Duraisamy", "Programming and Data Structures Lab-Ms.S.K.Umamaheswari,Ms.S.U.Muthunagai", "Library-Ms.Rajeswari Ramaraj"};
    String[] flececfive = {"Digital Communication-Ms.T.J.Jeyaprabha", "Principles of Digital Signal Processing-Ms.M.Vidya,Ms.B.Sarala(T)", "Transmission Lines and Waveguides-Mr.P.Muthukumaran,Ms.C.Gomatheeswari Preethika(T)", "Microprocessor and Microcontroller-Ms.K.S.Subhashini", "Environmental Science and Engineering-Ms.G.Thayanidhi", "Digital Signal Processing Lab-Ms.L.Anju, Ms.M.Vidya", "Communication System Lab-Mr.P.Muthukumaran,Ms.S.Radhika", "Microprocessor and Microcontroller Lab-Ms.K.S.Subhashini,Mr.G.Loganathan", "Library-Mr.M.H.Masood", "Seminar-Mr.G.Loganathan,Mr.P.Arul,Ms.A.Bharathipriya"};
    String[] flececseven = {"RF and Microwave Engineering-Dr.P.Jothilakshmi", "Optical Communication and Networks-Mr.S.SenthilRajan", "Embedded and Real Time Systems-Mr.S.P.Sivagnana Subramanian", "Satellite Communication/Digital Image Processing(Elective-II)-Ms.S.Radhika,Ms.L.Anju", "Advanced Computer Architecture(Electice-III)-Dr.G.A.Sathishkumar", "Advanced Microprocessors and Microcontrollers(Elective-IV)-Ms.S.M.Mehzabeen", "Embedded Lab-Ms.S.M.Mehzabeen,Ms.S.Reethi", "Optical and Microwave Lab-Mr.P.Muthukumaran,Ms.S.Sangeethapriya", "Library-Ms.A.Bharathipriya", "Seminar-Mr.N.Kumaran,Mr.M.Duraisamy,Ms.S.M.Mehzabeen,Ms.Rajeswari Ramaraj"};
    String[] fleeeathree = {"Mathematics-III-Ms.N.S.Priya", "Electronic Devices and Circuits-Ms.M.Maadhuri", "Electromagnetic Theory-Dr.C.Gopinath", "Electrical Machines-I-Mr.D.S.Purushothaman", "Programming and Data Structures-Ms.N.Uma", "Measurements and Instrumentations-Mr.C.Kamal", "Electrical Machines-I Lab-Mr.D.S.Prushothaman,Ms.M.Sasikala,Mr.R.Kannadasan", "Electronic Devices and Circuits Lab-Ms.M.Maadhuri,Ms.S.Anitha", "Programming and Data Structures Lab-Ms.N.Uma,Mr.V.Ranjith"};
    String[] fleeeafive = {"Power System Analysis-Mr.S.Thamizmani", "Microprocessors and Microcontrollers-Ms.D.Amudhavalli", "Power Plant Engineering-Mr.V.Sridharan", "Power Electronics-Dr.Nalin Kant Mohanty", "Electrical Machines-II-Mr.S.S.Sethuraman", "Control Systems-Mr.V.Mohanraj", "Control and Instrumentation Lab-Mr.V.Mohanraj,Ms.D.Amufhavalli", "Communications Skills Lab-Ms.S.B.Lavanya,Mr.Samuel Sudharsan Dawson", "Electrical Machines Lab-II-Mr.S.S.Sethuraman,Mr.T.Annamalai"};
    String[] fleeeaseven = {"High Voltage Engineering-Dr.K.Sundararaman", "Protection and Switchgear-Dr.S.G.Bharathidasan", "Special Electrical Machines-Mr.I.Venkatraman", "Principles of Management-Mr.R.Kannadasan", "Bio-Medical Instrumentation(E-II)-Dr.K.R.Santha", "Fundamentals of Nanoscience(E-III)-Ms.S.Anitha", "Microcontroller Based System Design(E-III)-Ms.D.Amudhavalli", "Power System Simulation Lab-Ms.S.G.Bharathidasan,Mr.M.Raj Vickram", "Comprehension-Mr.M.Sankar,Mr.R.Kannadasan/Mr.S.Sudharsanam,Ms.D.Amudhavalli,Mr.V.Mohanraj", "Soft Skills Training-Mr.S.Kumaravel,Ms.S.Angala Vaishnavi", "Central Library-Mr.M.Sankar", "Seminar-Mr.S.V.Sreeraj"};
    String[] fleeebthree = {"Mathematics-III-Dr.B.Thilaka", "Electronic Devices and Circuits-Mr.A.Tamizhselvan", "Electromagnetic Theory-Ms.M.Sasikala", "Electrical Machines-I-Ms.S.Arulmozhi", "Programming and Data Structures-Mr.E.Sakthivel", "Measurements and Instrumentations-Mr.M.Raj Vickram", "Electrical Machines-I Lab-Ms.S.Arulmozhi,Dr.K.Subdararaman,Ms.S.Angala Vaishnavi/Ms.M.Rajalakshmi", "Electronic Devices and Circuits Lab-Ms.S.Anitha/Dr.Sudhakar K Bharatan", "Programming and Data Structures Lab-Mr.E.Sakthivel,Mr.A.R.Gurugokul"};
    String[] fleeebfive = {"Power System Analysis-Mr.M.Sankar", "Microprocessors and Microcontrollers-Ms.K.S.Pavithra", "Power Plant Engineering-Mr.S.Arumugam", "Power Electronics-Ms.N.Shanmugavadivu", "Electrical Machines-II-Mr.T.Annamalai", "Control Systems-Mr.S.V.Sreeraj", "Control and Instrumentation Lab-Mr.S.V.Sreeraj,Ms.N.Shanmugavadivu", "Communications Skills Lab-Mr.Samuel Sudharsan Dawson,Mr.R.Premraj", "Electrical Machines Lab-II-Mr.T.Annamalai,Mr.S.S.Sethuraman"};
    String[] fleeebseven = {"High Voltage Engineering-Mr.C.Kamal", "Protection and Switchgear-Mr.C.Venkatesan", "Special Electrical Machines-Ms.K.Suganthi", "Principles of Management-Dr.R.Karthikeyan", "Bio-Medical Instrumentation(E-II)-Dr.C.Gopinath", "Fundamentals of Nanoscience(E-III)-Dr.Sudhakar K Bharatan", "Power System Simulation Lab-Mr.R.Kannadasan,Mr.C.Venkatesan", "Comprehension-Mr.C.Kamal,Ms.S.Sinthamani,Mr.D.Purushothaman,Mr.I.Venkatraman,Mr.M.Raj Vickram", "Soft Skills Training-Mr.M.Ranjithkumar,Mr.S.Thamizmani,Ms.K.Suganthi", "Central Library-Ms.M.Rajalakshmi", "Seminar-Ms.M.Maadhuri"};
    String[] flitathree = {"Mathematics III-Dr.R.Uma Devi", "Programming and Data Structures II-Ms.N.Devi", "Operating Systems-Dr.R.Anitha", "Computer Organization and Architecture-Mr.V.Ranjith", "Analog and Digital Communication-Mr.V.Rajaram", "Environmental Science and Engineering-Dr.C.Anand Babu", "Programming and Data Structures Lab II-Ms.N.Devi,Ms.R.Saktheeswari/Ms.P.Nirmala", "Operating Systems Lab-Mr.T.Sukumar,Ms.A.Rohini/Ms.U.Pooranima", "Analog and Digital Communication Lab-Mr.V.Rajaram,Mr.K.Suresh", "Library-Mr.S.Uvaraj Arutkumaran"};
    String[] flitafive = {"Computer Networks-Ms.V.Saroja", "Graphics and Multimedia-Ms.V.M.Sivagami", "Object Oriented Analysis and Design-Ms.C.Silambarasi", "Digital Signal Processing-Ms.K.S.Pavithra", "Web Programming-Ms.J.Sharon Ranjitha Esther", "Wireless Communication-Dr.C.Yaashuwanth", "Networks Lab-Ms.V.Saroja,Ms.U.Pooranima,Dr.C.Yaashuwanth", "Web Programming Lab-Ms.J.Sharon Ranjitha Esther,Ms.S.Kalavathi", "Case Tools Lab-Ms.C.Silambarasi,Mr.S.Uvaraj Arutkumaran", "Library-Ms.J.Sharon Ranjitha Esther"};
    String[] flitaseven = {"Information Management-Dr.G.Sumathi", "Cryptography and Network Security-Ms.R.Saktheeswari", "Data Ware Housing and Data Mining-Ms.S.Kalavathi", "Grid and Cloud Computing-Ms.D.Jayanthi", "Software Testing(E-II)-Ms.P.Leela Rani", "Data Analytics(E-II)-Ms.K.Kiruthika Devi", "Data Mining Lab-Ms.S.Kalavathi,Ms.P.Sharom Femi,Ms.K.Kiruthika Devi", "Security Lab-Ms.R.Saktheeswari,Ms.P.Leela Rani", "Grid and Cloud Computing Lab-Ms.D.Jayanthi,Ms.P.Leela Rani", "Library-Ms.P.Sharon Femi", "Seminar-Ms.L.Anita Elizabeth"};
    String[] flitbthree = {"Mathematics III-Ms.M.Ramya", "Programming and Data Structures II-Ms.A.Kala", "Operating Systems-Ms.B.T.Shobana", "Computer Organization and Architecture-Ms.N.Uma", "Analog and Digital Communication-Mr.K.Suresh", "Environmental Science and Engineering-Dr.A.Bhaskaran", "Programming and Data Structures Lab II-Ms.A.Kala,Ms.U.Pooranima", "Operating Systems Lab-Ms.B.T.Shobana,Ms.K.Kiruthika Devi", "Analog and Digital Communication Lab-Mr.K.Suresh,Mr.V.Rajaram", "Library-Ms.P.Leela Rani"};
    String[] flitbfive = {"Computer Networks-Ms.U.Pooranima", "Graphics and Multimedia-Ms.S.Jerusha", "Object Oriented Analysis and Design-Ms.Kiruba Wesley", "Digital Signal Processing-Mr.G.Vinoth Kumar", "Web Programming-Ms.L.Anitha Elizabeth", "Wireless Communication-Ms.M.Sugacini", "Networks Lab-Ms.U.Pooranima,Ms.V.Saroja,Dr.C.Yaashuwanth", "Web Programming Lab-Ms.L.Anitha Elizabeth,Ms.A.Kala", "Case Tools Lab-Ms.Kiruba Wesley,Ms.S.Jerusha", "Library-Ms.L.Anitha Elizabeth"};
    String[] flitbseven = {"Information Management-Mr.S.Uvaraj Arutkumaran", "Cryptography and Network Security-Ms.P.Nirmala", "Data Ware Housing and Data Mining-Dr.V.Vidhya", "Grid and Cloud Computing-Ms.G.Sangeetha", "Software Testing(E-II)-Ms.P.Leela Rani", "Data Analytics(E-II)-Ms.K.Kiruthika Devi", "Data Mining Lab-Ms.S.Kalavathi,Ms.P.Sharon Femi,Ms.K.Kiruthika Devi", "Security Lab-Ms.P.Nirmala,Ms.K.Nivethaa Shree", "Grid and Cloud Computing Lab-Ms.G.Sangeetha","Ms.N.Uma/Ms.L.Anitha Elizabeth", "Library-Ms.L.Anitha Elizabeth", "Seminar-Ms.U.Pooranima"};
    String[] flmechathree = {"Mathematics III-Dr.A.R.Vijayalakshmi", "Engineering Thermodynamics-Dr.K.Pithcandi/Mr.G.Suresh", "Manufacturing Technology I-Dr.N.Muthukrishnan", "Engineering Materials and Metallurgy-Dr.M.Mohandass", "Mechanics of Solids-Mr.M.Maheswaran/Dr.M.Prem Ananth", "Electrical Drives and Controls-Mr.S.Sudharasanam", "Manufacturing Technology Lab I-Dr.K.E.K.Vimal/Mr.S.Yeshwanth Raj(Tue)/Mr.G.Ganesan(Fri)", "Strength of Materials Lab-Dr.M.Mohandass/Mr.G.Logachandar(Wed)/Mr.M.Gajendiran(Fri)", "Electrical Engineering Lab-Mr.S.Sudharasanam/Mr.I.Venkatraman/Dr.S.G.Bharathidasan/Dr.K.Sundararaman"};
    String[] flmechafive = {"Computer Aided Design-Mr.M.Arulkumar", "Heat and Mass Transfer-Mr.R.Kaliyanasunder/Dr.P.Raghu", "Design of Machine Elements-Dr.T.Raja/Dr.R.Ramesh", "Metrology and Measurements-Mr.M.Kalaimani", "Dynamics of Machines-Mr.J.Sivaramapandian/Mr.C.Senthmaraikannan", "Professional Ethics in Engineering-Mr.S.Muniraj", "Dynamics Lab-Mr.Sivaramapandian/E.Suresh/Mr.M.Arulkumar", "Thermal Engineering Lab II-Mr.R.Kaliyanasunder/Mr.M.Gajendiran(Wed)/Mr.S.Arumugam(Mon)", "Metrology and Measurements Lab-Dr.S.Ponnuvel/Mr.V.Sridharan", "Library-Mr.M.Kalaimani", "Seminar-Mr.K.Karthee"};
    String[] flmechaseven = {"Power Plant Engineering-Mr.R.Kaliyanasunder", "Mechatronics-Mr.M.Arul Kumar", "Computer Integrated Manufacturing System-Dr.S.Ponnuvel", "Total Quality Management-Mr.S.Gopinath", "Process Planning and Cost Estimation-Mr.V.Senthilvelan", "Welding Technology-Dr.M.Ananth Kumar", "Energy Conservation and Management-Mr.G.Suresh", "Robotics-Dr.K.S.Badrinathan", "Maintenance Engineering-Mr.M.Nishal", "Simulation and Analysis Lab-Mr.M.Maheswaran(Mon)/Mr.G.Saravanaram(Wed)/Mr.K.Ramprasad", "Mechatronics Lab-Mr.S.Gopinath/Mr.M.Arulkumar", "Comprehension-Mr.S.Natarajan(Mon)/Mr.S.Yeshwanthraj(Thu)", "Seminar-Mr.E.Suresh", "Library-Dr.S.Ponnuvel/Mr.S.Gopinath"};
    String[] flmechbthree = {"Mathematics III-Dr.G.Satheesh Kumar", "Engineering Thermodynamics-Dr.S.Saravanan/Mr.S.Arumugam", "Manufacturing Technology I-Dr.M.Ananth Kumar", "Engineering Materials and Metallurgy-Mr.R.Ganesan", "Mechanics of Solids-Mr.G.Saravanaram/Mr.M.Maheswaran", "Electrical Drives and Controls-Mr.M.Ranjith Kumar", "Manufacturing Technology Lab I-Dr.M.Ananth Kumar,Mr.R.Ganesan/Mr.S.Yeshwanth Raj", "Strength of Materials Lab-Mr.Muniraj/Mr.G.Logachandar/G.Suresh", "Electrical Engineering Lab-Mr.M.Ranjith Kumar/Ms.M.Rajalaksjmi/Ms.K.Suganthi/Mr.M.Sankar"};
    String[] flmechbfive = {"Computer Aided Design-Mr.G.Kirubakaran", "Heat and Mass Transfer-Dr.P.Raghu/Mr.G.Logachandar", "Design of Machine Elements-Mr.M.Maheswaran/Mr.V.Sridaran", "Metrology and Measurements-Dr.S.Ilaiyavel", "Dynamics of Machines-Mr.C.Senthamarai Kannan/Dr.T.Raja", "Professional Ethics in Engineering-Mr.V.Senthilvelan", "Dynamics Lab-Mr.C.Senthamarai Kannan/Dr.M.Mohandass", "Thermal Engineering Lab II-Dr.P.Raghu/Mr.S.Arumugam(Tue)/Mr.G.Suresh(Wed)", "Metrology and Measurements Lab-Dr.S.Ilaiyavel/Mr.M.Kalaimani", "Library-Mr.C.Senthamarai Kannan", "Seminar-Dr.P.Raghu"};
    String[] flmechbseven = {"Power Plant Engineering-Mr.S.Natarajan", "Mechatronics-Mr.A.Kumaraswamy", "Computer Integrated Manufacturing System-Dr.K.E.K.Vimal", "Total Quality Management-Mr.K.Ramprasad", "Process Planning and Cost Estimation-Mr.V.Senthilvelan", "Welding Technology-Dr.M.Ananth Kumar", "Energy Conservation and Management-Mr.G.Suresh", "Robotics-Dr.K.S.Badrinathan", "Maintenance Engineering-Mr.K.Karthee", "Simulation and Analysis Lab-Mr.G.Kirubakaran/Mr.M.Maheswaran(Thu)/Mr.J.Sivaramapandiyan(Tue)", "Mechatronics Lab-Mr.A.Kumaraswamy/Mr.K.Karthee", "Comprehension-Dr.P.Raghu(Fri)/Mr.V.Senthilvelan(Wed)", "Seminar-Mr.M.Nishal", "Library-Dr.M.Ananth Kumar/Mr.A.Kumaraswamy"};


    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ttperiod);
        Bundle extras = getIntent().getExtras();
        x = extras.getInt("year");
        y = extras.getInt("sem");
        z = extras.getInt("sel");

        t = extras.getInt("sec");
        d = extras.getInt("day");
        listView = (ListView) findViewById(R.id.period);


        listView.setAdapter(new ArrayAdapter<String>(teacherlist.this, android.R.layout.simple_list_item_1, new ArrayList<String>()));

        if (x!= 0) {


            switch (z) // getting the valuefor depatrmnt
            {
                case 1:// automobile
                {
                    switch (t) {
                        case 1: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                // Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflautotwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflautofour().execute();
                                        break;
                                    case 6:
                                        new Asyncflautosix().execute();
                                        break;
                                    case 8:
                                        new Asyncflautoeight().execute();
                                        break;


                                }

                            } else {

                                //Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 1:
                                        new Asyncflautoone().execute();
                                        break;
                                    case 3:
                                        new Asyncflautothree().execute();
                                        break;
                                    case 5:
                                        new Asyncflautofive().execute();
                                        break;
                                    case 7:
                                        new Asyncflautoseven().execute();
                                        break;


                                }

                            }
                        }
                        break;
                    }
                }
                break;

                case 2: // biotech
                {
                    switch (t) {
                        case 1: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                // Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflbiotechtwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflbiotechfour().execute();
                                        break;
                                    case 6:
                                        new Asyncflbiotechsix().execute();
                                        break;
                                    case 8:
                                        new Asyncflbiotecheight().execute();
                                        break;


                                }
                            } else {
                                // Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 1:
                                        new Asyncflbiotechone().execute();
                                        break;
                                    case 3:
                                        new Asyncflbiotechthree().execute();
                                        break;
                                    case 5:
                                        new Asyncflbiotechfive().execute();
                                        break;
                                    case 7:
                                        new Asyncflbiotechseven().execute();
                                        break;


                                }


                            }
                            break;
                        }

                    }

                    break;
                }

                case 3: // chemical
                {
                    switch (t)       // selecting the respective section
                    {

                        case 1: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                // Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflchematwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflchemafour().execute();
                                        break;
                                    case 6:
                                        new Asyncflchemasix().execute();
                                        break;
                                    case 8:
                                        new Asyncflchemaeight().execute();
                                        break;

                                }


                            } else {

                                // Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();

                                switch (y) {
                                    case 1:
                                        new Asyncflchemaone().execute();
                                        break;
                                    case 3:
                                        new Asyncflchemathree().execute();
                                        break;
                                    case 5:
                                        new Asyncflchemafive().execute();
                                        break;
                                    case 7:
                                        new Asyncflchemaseven().execute();
                                        break;


                                }


                            }
                            break;
                        }

                        case 2: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                // Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflchembtwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflchembfour().execute();
                                        break;
                                    case 6:
                                        new Asyncflchembsix().execute();
                                        break;
                                    case 8:
                                        new Asyncflchembeight().execute();
                                        break;

                                }

                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncflchembone().execute();
                                        break;
                                    case 3:
                                        new Asyncflchembthree().execute();
                                        break;
                                    case 5:
                                        new Asyncflchembfive().execute();
                                        break;
                                    case 7:
                                        new Asyncflchembseven().execute();
                                        break;


                                }


                            }

                        }
                        break;
                    }

                    break;
                }
                case 4: // civil
                {

                    switch (t) {
                        case 1: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                //Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflciviltwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflcivilfour().execute();
                                        break;
                                    case 6:
                                        new Asyncflcivilsix().execute();
                                        break;
                                    case 8:
                                        new Asyncflcivileight().execute();
                                        break;

                                }


                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncflcivilone().execute();
                                        break;
                                    case 3:
                                        new Asyncflcivilthree().execute();
                                        break;
                                    case 5:
                                        new Asyncflcivilfive().execute();
                                        break;
                                    case 7:
                                        new Asyncflcivilseven().execute();
                                        break;


                                }


                            }
                            break;
                        }
                    }
                    break;
                }
                case 5: //eee
                {
                    switch (t)       // selecting the respective section
                    {

                        case 1: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                //Toast.makeText(facultyadv.this, "Teacher list not available yet", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncfleeeatwo().execute();
                                        break;
                                    case 4:
                                        new Asyncfleeeafour().execute();
                                        break;
                                    case 6:
                                        new Asyncfleeeasix().execute();
                                        break;
                                    case 8:
                                        new Asyncfleeeaeight().execute();
                                        break;

                                }

                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncfleeeaone().execute();
                                        break;
                                    case 3:
                                        new Asyncfleeeathree().execute();
                                        break;
                                    case 5:
                                        new Asyncfleeeafive().execute();
                                        break;
                                    case 7:
                                        new Asyncfleeeaseven().execute();
                                        break;


                                }

                            }
                            break;
                        }

                        case 2: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                //Toast.makeText(facultyadv.this, "Teacher list not available yet", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncfleeebtwo().execute();
                                        break;
                                    case 4:
                                        new Asyncfleeebfour().execute();
                                        break;
                                    case 6:
                                        new Asyncfleeebsix().execute();
                                        break;
                                    case 8:
                                        new Asyncfleeebeight().execute();
                                        break;

                                }


                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncfleeebone().execute();
                                        break;
                                    case 3:
                                        new Asyncfleeebthree().execute();
                                        break;
                                    case 5:
                                        new Asyncfleeebfive().execute();
                                        break;
                                    case 7:
                                        new Asyncfleeebseven().execute();
                                        break;


                                }

                            }
                            break;
                        }

                    }
                    break;

                }
                case 6: // it
                {
                    switch (t)       // selecting the respective section
                    {

                        case 1: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                //Toast.makeText(facultyadv.this, "Teacher list not available yet", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflitatwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflitafour().execute();
                                        break;
                                    case 6:
                                        new Asyncflitasix().execute();
                                        break;
                                    case 8:
                                        new Asyncflitaeight().execute();
                                        break;

                                }


                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncflitaone().execute();
                                        break;
                                    case 3:
                                        new Asyncflitathree().execute();
                                        break;
                                    case 5:
                                        new Asyncflitafive().execute();
                                        break;
                                    case 7:
                                        new Asyncflitaseven().execute();
                                        break;


                                }

                            }
                            break;
                        }

                        case 2: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                // Toast.makeText(facultyadv.this, "Teacher list not available yet", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflitbtwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflitbfour().execute();
                                        break;
                                    case 6:
                                        new Asyncflitbsix().execute();
                                        break;
                                    case 8:
                                        new Asyncflitbeight().execute();
                                        break;

                                }

                            } else {


                                switch (y) {
                                    case 1:
                                        new Asyncflitbone().execute();
                                        break;
                                    case 3:
                                        new Asyncflitbthree().execute();
                                        break;
                                    case 5:
                                        new Asyncflitbfive().execute();
                                        break;
                                    case 7:
                                        new Asyncflitbseven().execute();
                                        break;


                                }

                            }
                            break;
                        }

                    }
                    break;
                }
                case 7://ece
                {
                    switch (t)       // selecting the respective section
                    {

                        case 1: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                //  Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncfleceatwo().execute();
                                        break;
                                    case 4:
                                        new Asyncfleceafour().execute();
                                        break;
                                    case 6:
                                        new Asyncfleceasix().execute();
                                        break;
                                    case 8:
                                        new Asyncfleceaeight().execute();
                                        break;

                                }


                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncfleceaone().execute();
                                        break;
                                    case 3:
                                        new Asyncfleceathree().execute();
                                        break;
                                    case 5:
                                        new Asyncfleceafive().execute();
                                        break;
                                    case 7:
                                        new Asyncfleceaseven().execute();
                                        break;


                                }
                            }
                            break;
                        }

                        case 2: {
                            if (y % 2 == 0) // calling the even semester
                            {

                                // Toast.makeText(facultyadv.this, "Teacher list not available ", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflecebtwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflecebfour().execute();
                                        break;
                                    case 6:
                                        new Asyncflecebsix().execute();
                                        break;
                                    case 8:
                                        new Asyncflecebeight().execute();
                                        break;

                                }

                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncflecebone().execute();
                                        break;
                                    case 3:
                                        new Asyncflecebthree().execute();
                                        break;
                                    case 5:
                                        new Asyncflecebfive().execute();
                                        break;
                                    case 7:
                                        new Asyncflecebseven().execute();
                                        break;


                                }

                            }
                            break;
                        }
                        case 3: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                // Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflecectwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflececfour().execute();
                                        break;
                                    case 6:
                                        new Asyncflececsix().execute();
                                        break;
                                    case 8:
                                        new Asyncflececeight().execute();
                                        break;

                                }

                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncflececone().execute();
                                        break;
                                    case 3:
                                        new Asyncflececthree().execute();
                                        break;
                                    case 5:
                                        new Asyncflececfive().execute();
                                        break;
                                    case 7:
                                        new Asyncflececseven().execute();
                                        break;

                                }

                            }
                            break;

                        }

                    }
                    break;
                }
                case 8: // cse
                {
                    switch (t)       // selecting the respective section
                    {

                        case 1: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                //Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflcseatwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflcseafour().execute();
                                        break;
                                    case 6:
                                        new Asyncflcseasix().execute();
                                        break;
                                    case 8:
                                        new Asyncflcseaeight().execute();
                                        break;

                                }

                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncflcseaone().execute();
                                        break;
                                    case 3:
                                        new Asyncflcseathree().execute();
                                        break;
                                    case 5:
                                        new Asyncflcseafive().execute();
                                        break;
                                    case 7:
                                        new Asyncflcseaseven().execute();
                                        break;

                                }


                            }
                            break;
                        }

                        case 2: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                // Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflcsebtwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflcsebfour().execute();
                                        break;
                                    case 6:
                                        new Asyncflcsebsix().execute();
                                        break;
                                    case 8:
                                        new Asyncflcsebeight().execute();
                                        break;

                                }


                            } else {
                                switch (y) {
                                    case 1:
                                        new Asyncflcsebone().execute();
                                        break;
                                    case 3:
                                        new Asyncflcsebthree().execute();
                                        break;
                                    case 5:
                                        new Asyncflbiotechfive().execute();
                                        break;
                                    case 7:
                                        new Asyncflbiotechseven().execute();
                                        break;

                                }


                            }
                            break;
                        }
                        case 3: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                //Toast.makeText(facultyadv.this, "Teacher list Not yet given", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflcsectwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflcsecfour().execute();
                                        break;
                                    case 6:
                                        new Asyncflcsecsix().execute();
                                        break;
                                    case 8:
                                        new Asyncflcseceight().execute();
                                        break;

                                }

                            } else {
                                switch (y) {
                                    case 1:
                                        new Asyncflcsecone().execute();
                                        break;
                                    case 3:
                                        new Asyncflcsecthree().execute();
                                        break;
                                    case 5:
                                        new Asyncflcsecfive().execute();
                                        break;
                                    case 7:
                                        new Asyncflcsecseven().execute();
                                        break;

                                }


                            }
                            break;

                        }

                    }
                    break;

                }
                case 9:  // mech
                {
                    switch (t)       // selecting the respective section
                    {

                        case 1: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                // Toast.makeText(facultyadv.this, "Teacher list Not yet given", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflmechatwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflmechafour().execute();
                                        break;
                                    case 6:
                                        new Asyncflmechasix().execute();
                                        break;
                                    case 8:
                                        new Asyncflmechaeight().execute();
                                        break;

                                }
                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncflmechaone().execute();
                                        break;
                                    case 3:
                                        new Asyncflmechathree().execute();
                                        break;
                                    case 5:
                                        new Asyncflmechafive().execute();
                                        break;
                                    case 7:
                                        new Asyncflmechaseven().execute();
                                        break;
                                }


                            }
                            break;
                        }

                        case 2: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                //Toast.makeText(facultyadv.this, "Teacher list Not yet given", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflmechbtwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflmechbfour().execute();
                                        break;
                                    case 6:
                                        new Asyncflmechbsix().execute();
                                        break;
                                    case 8:
                                        new Asyncflmechbeight().execute();
                                        break;

                                }

                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncflmechbone().execute();
                                        break;
                                    case 3:
                                        new Asyncflmechbthree().execute();
                                        break;
                                    case 5:
                                        new Asyncflmechbfive().execute();
                                        break;
                                    case 7:
                                        new Asyncflmechbseven().execute();
                                        break;
                                }


                            }
                            break;
                        }

                    }
                    break;

                }
            }
        }
    }

    public class Asyncflautoone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flautoone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflbiotechone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flbiotechone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchemaone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchemaone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchembone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchembone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcivilone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcivilone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcseaone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcseaone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsebone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsebone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsecone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsecone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleceaone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleceaone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflecebone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flecebone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflececone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flececone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeeaone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeeaone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeebone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeebone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitaone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitaone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitbone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitbone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechaone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechaone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechbone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechbone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }


    public class Asyncflautotwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flautotwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflbiotechtwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flbiotechtwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }


    public class Asyncflchematwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchematwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchembtwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchembtwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflciviltwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flciviltwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcseatwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcseatwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsebtwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsebtwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsectwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsectwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleceatwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleceatwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflecebtwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flecebtwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflecectwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flecectwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeeatwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeeatwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeebtwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeebtwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitatwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitatwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitbtwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitbtwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechatwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechatwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechbtwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechbtwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }


    public class Asyncflautofour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flautofour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflbiotechfour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flbiotechfour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchemafour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchemafour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchembfour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchembfour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcivilfour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcivilfour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcseafour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcseafour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsebfour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsebfour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsecfour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsecfour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleceafour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleceafour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflecebfour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flecebfour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflececfour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flececfour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeeafour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeeafour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeebfour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeebfour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitafour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitafour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitbfour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitbfour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechafour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechafour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechbfour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechbfour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflautosix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flautosix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflbiotechsix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flbiotechsix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchemasix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchemasix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchembsix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchembsix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcivilsix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcivilsix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcseasix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcseasix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsebsix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsebsix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsecsix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsecsix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleceasix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleceasix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflecebsix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flecebsix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflececsix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flececsix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeeasix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeeasix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeebsix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeebsix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitasix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitasix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitbsix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitbsix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechasix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechasix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechbsix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechbsix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflautoeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flautoeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflbiotecheight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flbiotecheight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchemaeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchemaeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchembeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchembeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcivileight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcivileight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcseaeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcseaeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsebeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsebeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcseceight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcseceight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleceaeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleceaeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflecebeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flecebeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflececeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flececeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeeaeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeeaeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeebeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeebeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitaeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitaeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitbeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitbeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechaeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechaeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechbeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechbeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    //odd sem asynctask

    public class Asyncflautothree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flautothree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflbiotechthree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flbiotechthree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchemathree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchemathree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchembthree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchembthree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcivilthree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcivilthree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcseathree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcseathree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsebthree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsebthree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsecthree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsecthree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleceathree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleceathree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflecebthree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flecebthree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflececthree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flececthree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeeathree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeeathree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeebthree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeebthree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitathree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitathree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitbthree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitbthree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechathree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechathree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechbthree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechbthree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflautofive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flautofive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflbiotechfive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flbiotechfive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchemafive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchemafive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchembfive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchembfive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcivilfive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcivilfive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcseafive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcseafive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsebfive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsebfive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsecfive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsecfive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleceafive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleceafive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflecebfive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flecebfive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflececfive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flececfive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeeafive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeeafive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeebfive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeebfive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitafive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitafive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitbfive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitbfive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechafive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechafive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechbfive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechbfive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflautoseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flautoseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflbiotechseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flbiotechseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchemaseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchemaseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchembseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchembseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcivilseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcivilseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcseaseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcseaseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsebseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsebseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsecseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsecseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleceaseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleceaseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflecebseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flecebseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflececseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flececseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeeaseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeeaseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeebseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeebseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitaseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitaseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitbseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitbseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechaseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechaseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechbseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechbseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }


}










