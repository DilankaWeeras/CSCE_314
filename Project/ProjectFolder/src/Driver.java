//imports needed
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.*;
import java.io.File;
import javax.swing.filechooser.*;

public class Driver {

	private JFrame frame; // frame of the hui
	private JTextArea resultsTextbox; // results textbox that will be modified
	private JTextField fileNameTextbox; // filename textbox that will be modified
	private JTextArea errorsTextbox; // errors textbox
	private final JFileChooser openFileChooser; // used to open file explorer
	private File csv; // used to hold the file, can also be a String

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Driver window = new Driver();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Driver() {
		initialize();

		openFileChooser = new JFileChooser();
		//openFileChooser.setCurrentDirectory(new File("/home/dweerasinghe/Documents/CSCE_314/Project/srcbkp/src"));
		openFileChooser.setFileFilter(new FileNameExtensionFilter("CSV", "csv"));	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		TeamBuilder summerClass = new TeamBuilder(); //initialize summer class

		/*
		Create the frame for the gui
		Dimensions are 1155 by 772
		*/
		frame = new JFrame();
		frame.setBounds(100, 100, 1155, 772);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		/*
		Button for Generate Teams Action
		performsa an action to set the exts in the results textbox and the errors textbox
		*/
		JButton GenerateTeams = new JButton("Generate Teams");
		GenerateTeams.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				resultsTextbox.setText(summerClass.printPartners());
				errorsTextbox.setText(summerClass.errorToString());
			}
		});
		GenerateTeams.setBounds(965, 673, 168, 50); //dimensions+position of the button
		frame.getContentPane().add(GenerateTeams); // add button to the frame

		JLabel lblResults = new JLabel("Results:"); // label for the Results
		lblResults.setBounds(30, 171, 70, 15);
		frame.getContentPane().add(lblResults); // add label to the frame

		JLabel lblErrors = new JLabel("Errors:"); // label fo the errors
		lblErrors.setBounds(717, 171, 70, 15);
		frame.getContentPane().add(lblErrors); // add label to the frame

		JLabel lblFilename = new JLabel("Filename:"); // label for filename
		lblFilename.setBounds(30, 124, 70, 15);
		frame.getContentPane().add(lblFilename); // add label to the frame

		fileNameTextbox = new JTextField(); // filename text box, will not handle new lines
		fileNameTextbox.setBounds(108, 122, 114, 19); // position and dimension the box
		frame.getContentPane().add(fileNameTextbox); // add to frame
		fileNameTextbox.setColumns(10);
		fileNameTextbox.setText("No file chosen"); // set default text


		JLabel TitleBox = new JLabel("CSCE 314 Java Team Creator"); // set Title
		TitleBox.setFont(new Font("Dialog", Font.BOLD, 30)); // Font of the Title
		TitleBox.setBounds(309, 12, 503, 63); // pos+dim of Title
		frame.getContentPane().add(TitleBox); // add to frame

		JButton btnFile = new JButton("Open file"); // Open file button
		btnFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { // action performed on the button
				int returnValue  = openFileChooser.showOpenDialog(btnFile); // This will open the file explorer, for some reason it can only pull certain csv in my experience

				if(returnValue == JFileChooser.APPROVE_OPTION) // if the file explorer is open
				{
					try
					{
						csv = openFileChooser.getSelectedFile(); // 
						fileNameTextbox.setText(csv.getName());
						//fileNameTextbox.setText("test1.csv");

						summerClass.importStudents(csv.getName());        //Import students from test1 to Summer Class

						summerClass.sortStudents();               //Sort students by Java Knowledge
						System.out.println(summerClass.toString());     //testing for sort

						summerClass.PartnerStudent();                   //Partner Students
						//System.out.println(summerClass.printPartners());//Print partners to terminal
						summerClass.writeResults();                     //write to results.txt

					}
					catch(Exception ioe)
					{
					}
				}
				else
				{
					fileNameTextbox.setText("No file Chosen");
				}


			}
		});
		btnFile.setBounds(0, 0, 117, 25);
		frame.getContentPane().add(btnFile);


		/*
		Scroll the Results
		*/
		JScrollPane paneResults = new JScrollPane(resultsTextbox, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		paneResults.setBounds(677, 198, 17, 463);
		frame.getContentPane().add(paneResults);

		resultsTextbox = new JTextArea(); // text area for the results, Area will handle newlines
		resultsTextbox.setFont(new Font("Dialog", Font.PLAIN, 14)); // set font from default to larger
		resultsTextbox.setBounds(30, 198, 646, 463); //pos+dim
		frame.getContentPane().add(resultsTextbox); // add to frame
		resultsTextbox.setColumns(10);

		/*
		Scroll the errors
		*/
		JScrollPane paneErrors = new JScrollPane(errorsTextbox, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		paneErrors.setBounds(1116, 198, 17, 463);
		frame.getContentPane().add(paneErrors);

		errorsTextbox = new JTextArea(); // text area for errors
		errorsTextbox.setFont(new Font("Dialog", Font.PLAIN, 10));
		errorsTextbox.setBounds(717, 198, 397, 463);
		frame.getContentPane().add(errorsTextbox);
		errorsTextbox.setColumns(10);



	}
}
