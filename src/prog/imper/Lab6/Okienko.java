package prog.imper.Lab6;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

// awt w 2d niski poziom okienka
// swing okna przyciski

public class Okienko extends JFrame implements ActionListener{
	
	private JTextArea textArea;
	
	private JMenuItem openFile;
	
	public static final String[] words= {"fdsfsdf", "fsdfsdf", "ala ", "Ok" , "dzia³a"};
	
	public Okienko () {
		super("Moje okienko");
		setSize(600, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout()); //NS WE and middle
		initComponents();
		pack();
	}

	private void initComponents()
	{
		
		JMenuBar menuBar= new JMenuBar();
		JMenu fileMenu=new JMenu("File");
		openFile=new JMenuItem("Open");
		openFile.addActionListener(this);
		fileMenu.add(openFile);
		menuBar.add(fileMenu);
		setJMenuBar(menuBar);
		
		JPanel textPanel=new JPanel();
		JPanel buttonsPanel1=new JPanel();
		buttonsPanel1.setLayout(new FlowLayout());
		toLowerCase=new JButton("Ma³e literki");
		toLowerCase.addActionListener(this);
		buttonsPanel1.add(toLowerCase);
		toUpperCase=new JButton("Du¿e litery");
		toUpperCase.addActionListener(this);
		buttonsPanel1.add(toUpperCase);
		generalRandomtext=new JButton(" Generte");
		generalRandomtext.addActionListener(this);
		buttonsPanel1.add(generalRandomtext);
		
		
		add(buttonsPanel1,BorderLayout.SOUTH);
		
	
		
		textArea=new JTextArea(15,35);
		textArea.setText("asdasd  ala mDSFSFSDFa moa \n\n sdssagsdg");
		textPanel.add(textArea);
		add(textPanel,BorderLayout.CENTER);
		
		
	}
	private JButton toLowerCase;
	private JButton toUpperCase;
	private JButton generalRandomtext;



	@Override
	public void actionPerformed(ActionEvent e) {
		Object source =e.getSource();
		if(source==toLowerCase)
		{
			textArea.setText(textArea.getText().toLowerCase());
		}
		else if (source==toUpperCase)
		{
			textArea.setText(textArea.getText().toUpperCase());
		}
		else if( source==generalRandomtext)
		{
			System.out.println("Generate clicked");
			Random rand = new Random();
			StringBuffer sb=new StringBuffer();
			for (int i = 0; i < 6; i++) {
				int indx=rand.nextInt(words.length);
				sb.append(words[indx]+ " ");
				if((i&1)==0)
					sb.append("\n");
			}
			textArea.setText(sb.toString());
		}
		else if (source==openFile)
		{
			JFileChooser fileChooser=new JFileChooser();
			fileChooser.setMultiSelectionEnabled(false);
			fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
			fileChooser.setCurrentDirectory(new File("."));
			int returnVal=fileChooser.showOpenDialog(null);
			if( returnVal==JFileChooser.APPROVE_OPTION) {
				File selecedFile=fileChooser.getSelectedFile();
				System.out.println("Open file: "+ selecedFile);
				try {
					List<String> lines=Files.readAllLines(selecedFile.toPath());
					StringBuilder sb=new StringBuilder();
					for (String line: lines) {
						sb.append(line+ "\n");
					}
					textArea.setText(sb.toString());
				}
					catch(IOException ex)
					{
						System.err.println("Cannot reaf files:" + selecedFile);
					}
				}
			}
			
		}
		
	public static void main(String[] args) {
		Okienko app=new Okienko();
		app.setVisible(true);
	}
}

