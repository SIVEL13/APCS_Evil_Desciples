import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

  public class Game{
	  
  JFrame window;
  Container con;
  JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel, displayimage, displaymean;
  EndScreen loser, winner;
  JLabel titleNameLabel, hpLabel, hpLabelNumber, wizardHpLabel, wizardLabelhp, imageL, imageW;
  Font titleFont = new Font("Times New Roman", Font.PLAIN, 45);
  Font normalFont = new Font ("Times New Roman", Font.PLAIN, 30);
  Font wizardFont = new Font ("Times New Roman", Font.PLAIN, 25);
  JButton startButton, choice1, choice2, choice3, choice4;  
  JTextArea mainTextArea, loserScreen, winnerScreen; 
  ImageIcon image, pic; 
  BasicWand wand1;  
  Wizard w1;
  Wizard w2; 
  Wizard w3;
  Wizard fc;
  Wizard[] wizardsInOrder;
  Wizard currentWizard;
  Character player;
  
  TitleScreenHandler tsHandler = new TitleScreenHandler();
private ArrayList<WizQs1> currentQuestions;
public void SetWzd1qs(ArrayList<WizQs1> arr) {
	currentQuestions = arr;
}
  
  public static void main(String[] args) {

   new Game();
   
   JOptionPane.showMessageDialog(null, "This game will take you on path to DEFEAT Cuellar's Evil Warrios. \n You will start with 100.0 health and as you go on you CANNOT regernerate health! \n There are 3 loyal warrios you will need to fight before getting to Cuellar HIMSELF!!! \n each wizard you beat you will gain a better level wand which will deal more damage. \n As you go on each Wizard does slightly more power. \n If you get a question right, you deal damage, however, get one wrong and damage will be dealt", "INFORMATION",JOptionPane.INFORMATION_MESSAGE);
    
  
  }
  
  public Game(){ 
	   w1 = new Wizard("1st desciple!", 25, 15, 10, 100.0,
			   new Wiz(
					   new String[] {"What is 2+2??????!!!", "What is Cuellars Favorite show?", "What is the Pythagorean theorem?", "Who is the main character of Harry Potter?", "What is the Capital of California?", "Who is the creator of Facebook?", "What is 7 * 1 + 10 / 2??", "What is Cuellar's favorite food????"},
					   new int[] {0,3,2,1,1,0,3,2},
					   new String[][]{
						   {"4", "0","four","2"},
						   {"Suits", "Game of Thrones","Entourage", "Big Bang Theory"},
						   {"a^2 – b^2 = (a – b)(a + b)","(ab)n = anbn","a^2 + b^2 = c^2","(a + b)2 = a2 + 2ab + b2"},
						   {"Loser Voldemort","harry potter","lame draco","cool man dobby"},
						   {"Arkansas","Sacramento","Washington D.C", "Los Angeles","idk, im not good with geography"},
						   {"Marck Zuckerburg","Elon Musk", "Jeff Bezos","Ryan Cool man Ruelas"},
						   {"58", "92","21","12"},
						   {"chile rellenos","aguas chilles","kung pao spaghetti","mole"},
					   }
					   ));    
	   w2 = new Wizard("2nd desciple!",35,30,20,100.0,
			   new Wiz(
	   					new String[] {"What is Cuellar's favorite number?","I forgot my question smh.. answer is yes. hehe","Who is the best soccer player??(only one right answer hehe)","What would happen if you mix ammonium nitrate and fuel together?","Is cuellar funny? wrong asnwers only!","is the game cool?(only one right asnwer)","if you've made it this far, that means you keep answering worng HAHAHAHAH. free one, answer is no.","What is Cuellar's second favorite snaack????"},
	   					new int[] {3,2,1,0,1,2,3,2},
	   					new String [][] {
	   						{"1","2","22","4"},
	   						{"yes","maybe","no","what was my question?"},
	   						{"caca ronaldo","mini messi","haaland","mbappe"},
	   						{"BOOM","fart noise","nothing","toxic air"},
	   						{"YES!","NOOOOOOOOO","maybe","barley"},
	   						{"Heck no","nah its lame","HECK YEA","im hungry"},
	   						{"yes","maybe so", "no","no but twice"},
	   						{"purple popcorn","regular popcorn","nachos","candy apple"},
	   					}
	   					));
	   w3 = new Wizard("Cuellar's Favorite Desciple!!", 40, 35, 25, 100.0,
			   new Wiz(
	   					new String[] {"What is Cuellar's favorite SNACK!!!!?","Why did the chicken cross the road?","What always comes but never arrives?","How many houses are at hogwarts?","What does E= mc^2 mean???","If you were going 60 mph, how far would you be in one hour?","Who was the strongest character in Harry Potter?","What is Cuellar's third favorite movie????"},
	   					new int[] {0,3,2,3,0,1,2,3},
	   					new String [][] {
	   						{"purple popcorn","regular popcorn","nachos","candy apple"},
	   						{"He saw another chicken", "to get to the other side","he was hungry","he saw cuellar coming his way"},
	   						{"youtube ads","Cuellars lessons","tomorrow","money"},
	   						{"1","2","3","4"},
	   						{"Energy equals mass times the speed of light squared","Equality = Massive Canes twice","Equals eat 2x McChickens","Energy equals weight times the speed of light squared"},
	   						{"60 mph","60 miles in 1 hour","60km","60in"},
	   						{"voldemort","draco","dumbledore","harry"},
	   						{"Cars","Braveheart","Star wars","Saving Private Ryan"},
	   					}
	   					));
	   fc = new Wizard("MR. CUELLAR HIMSELF!!!", 50, 40, 30, 100.00,
			   new Wiz(
	   					new String[] {"In BraveHart, why did William Wallace go to war?","What's my favorite sport to watch😈😈???","If you passed 2nd place in a race, what place are you in?","9*9+4*100+5%4","How many brothers did Saving Private Ryan have?","Why in HackSaw Ridge did Doss the protagonist refuse to use a gun?","What is 7 * 1 + 10 / 2??","What is My second favorite show????"},
	   					new int[] {2,1,3,1,3,2,0,0},
	   					new String [][] {
	   						{"for a girl","he was lonley","independace","loyalty"},
	   						{"soccer","volleyball","football","basketball"},
	   						{"thrid","first","same place","second"},
	   						{"12","482","483","481"},
	   						{"0","1","2","3"},
	   						{"he was scared","he was foreced to be there but didnt want to be","Against his beliefs","whos doss again?"},
	   						{"12","21","1","2"},
	   						{"The Office", "Game of Thrones","Entourage", "Big Bang Theory"},
	   					}
	   					));
	    wizardsInOrder = new Wizard[] {w1, w2, w3,fc};
	    currentWizard = wizardsInOrder[0];
	    	   
    //sets JFrame that game is held on
    window = new JFrame();
    window.setSize(800, 600);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setLayout(null);
    window.getContentPane().setBackground(Color.black);
    window.setLocationRelativeTo(null);
    con = window.getContentPane();

    //Sets the title of the game on JFrame
    titleNamePanel = new JPanel();
    titleNamePanel.setBounds(100, 100, 600, 150);
    titleNamePanel.setBackground(Color.black);
    titleNameLabel = new JLabel("CUELLAR'S EVIL DESCIPLE'S"); 
    titleNameLabel.setForeground(Color.white);
    titleNameLabel.setFont(titleFont);
    
    startButtonPanel = new JPanel();
    startButtonPanel.setBounds(300, 400, 200, 100);
    startButtonPanel.setBackground(Color.black);
    
    startButton = new JButton("START");
    startButton.setBackground(Color.black);
    startButton.setForeground(Color.black);
    startButton.setFont(normalFont);
    startButton.addActionListener(tsHandler);
    
    titleNamePanel.add(titleNameLabel);
    startButtonPanel.add(startButton);
    con.add(titleNamePanel);
    con.add(startButtonPanel);
    window.setVisible(true);
  }
  
  public void playStage() {
	  wizardHpLabel.setText(currentWizard.getName() + ";");
	  hpLabelNumber.setText("" + player.getXp());
	  wizardLabelhp.setText("" + currentWizard.getXp());
	  mainTextArea.setText(currentWizard.getQuestionsAndAnswers().getQuestion());
	  
	  for( ActionListener al : choice1.getActionListeners() ) {
	        choice1.removeActionListener( al );
	    }
	  for( ActionListener al : choice2.getActionListeners() ) {
	        choice2.removeActionListener( al );
	    }
	  for( ActionListener al : choice3.getActionListeners() ) {
	        choice3.removeActionListener( al );
	    }
	  for( ActionListener al : choice4.getActionListeners() ) {
	        choice4.removeActionListener( al );
	    }
	  JButton [] buttonChoice = new JButton[] {choice1, choice2, choice3, choice4};
	  for(int i = 0; i < 4; i++) {
		  currentWizard.getQuestionsAndAnswers().getPossibleAnswers();
		  buttonChoice[i].setText(currentWizard.getQuestionsAndAnswers().getPossibleAnswers()[i]);
		  if(i == currentWizard.getQuestionsAndAnswers().getRightIndex()) {
			  buttonChoice[i].addActionListener(new correctAnswers());
		  }else {
			  buttonChoice[i].addActionListener(new wrongAnswers()); 
		  }
	  }	  
  }
  public class correctAnswers implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		int damage = player.getDamage() + wand1.getDamage();
		currentWizard.takeDamage(damage);
		if(currentWizard.getXp() <= 0.0) {
			for(int i = 0; i < wizardsInOrder.length; i++ ) {
				if(currentWizard == wizardsInOrder[i]) {
					if(currentWizard == fc) {
						titleNamePanel.setVisible(false);
						startButtonPanel.setVisible(false);
						mainTextPanel.setVisible(false);
						choiceButtonPanel.setVisible(false);
						playerPanel.setVisible(false);
						loser.setVisible(false);
						displayimage.setVisible(false);
						winner.setVisible(true);
						return;
					}
					currentWizard = wizardsInOrder[i+1];
					playStage();
					break;
				}
			}
		}else {
			currentWizard.getQuestionsAndAnswers().nextQuestion();
			playStage();
		}
	}
	  
  }
  public class wrongAnswers implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		int damage = currentWizard.getDamage();
		player.takeDamage(damage);
		if(player.getXp() <= 0.0) {
			titleNamePanel.setVisible(false);
			startButtonPanel.setVisible(false);
			mainTextPanel.setVisible(false);
			choiceButtonPanel.setVisible(false);
			playerPanel.setVisible(false);
			winner.setVisible(false);
			loser.setVisible(true);
			
				return;
		}else {
			currentWizard.getQuestionsAndAnswers().nextQuestion();
			playStage();
		}
	}
}
	  
 public class EndScreen extends JPanel {
	 private JTextArea text;
	 private JPanel image;
	 public void setText(JTextArea txt) {
		 text = txt;
		 add(txt);
	 }
	 public void setImage(JPanel img) {
		 image = img;
		 add(img);
	 }
	 public void paintComponent(Graphics g) {
		 super.paintComponent(g);
		 text.paint(g);
		 image.paint(g);
	 }
 }

  public void createGameScreen(){
	  player = new Character("name", 20, 30, 20, 100.0);
	  wand1 = new BasicWand();
	  String s = JOptionPane.showInputDialog(null, "Before we begin, Tell me your name young warrior!");
	  
	  displayimage = new JPanel();
	    displayimage.setBounds(50, 0, 1000, 800);
	    displayimage.setBackground(new Color(0,0,0,0));
	    imageL = new JLabel();
	    image = new ImageIcon(".//res//cuellarnicepictuew//cullarnice.png");
	    imageL.setIcon(image);
	    displayimage.add(imageL);
	    displayimage.setVisible(false);
	    
	    displaymean = new JPanel();
	    displaymean.setBounds(50, 0, 1000, 800);
	    displaymean.setBackground(new Color(0,0,0,0));
	    imageW = new JLabel();
	    pic = new ImageIcon(".//res//cuellarmean//mean.png");
	    imageW.setIcon(pic);
	    displaymean.add(imageW);
	    displaymean.setVisible(false);
	
	   
	  titleNamePanel.setVisible(false);
	  startButtonPanel.setVisible(false);
	  con.remove(titleNameLabel);
	  con.remove(startButtonPanel);
	  
	  mainTextPanel = new JPanel();
	  mainTextPanel.setBounds(100, 100, 600, 250);
	  mainTextPanel.setBackground(Color.black);
	  
	  mainTextArea= new JTextArea("question");
	  mainTextArea.setBounds(100, 100, 600, 250);
	  mainTextArea.setBackground(Color.black);
	  mainTextArea.setForeground(Color.white);
	  mainTextArea.setFont(normalFont);
	  mainTextArea.setLineWrap(true);
	  mainTextPanel.add(mainTextArea);
	  
	  con.add(mainTextPanel);
	    
	  choiceButtonPanel = new JPanel();
	  choiceButtonPanel.setBounds(250, 350, 300, 150);
	  choiceButtonPanel.setBackground(Color.black);
	  choiceButtonPanel.setLayout(new GridLayout(4,1));
	  con.add(choiceButtonPanel);
	  
	  choice1 = choiceButton("Answer 1");
	  choiceButtonPanel.add(choice1);
	  choice2 = choiceButton("Answer 2");
	  choiceButtonPanel.add(choice2);
	  choice3 = choiceButton("Answer 3");
	  choiceButtonPanel.add(choice3);
	  choice4 = choiceButton("Answer 4");
	  choiceButtonPanel.add(choice4); 
	    
	  playerPanel= new JPanel();
	  playerPanel.setBounds(100, 15, 600, 50);
	  playerPanel.setBackground(Color.black);
	  playerPanel.setForeground(Color.white);
	  playerPanel.setLayout(new GridLayout(1,4));
	  con.add(playerPanel);
	  hpLabel = new JLabel(s + "'s" + " HP:");
	  hpLabel.setFont(normalFont);
	  hpLabel.setForeground(Color.white);
	  playerPanel.add(hpLabel);
	  hpLabelNumber = new JLabel();
	  hpLabelNumber.setFont(normalFont);
	  hpLabelNumber.setForeground(Color.white);
	  playerPanel.add(hpLabelNumber);
	  wizardHpLabel = new JLabel("Wizard:");
	  wizardHpLabel.setFont(wizardFont);
	  wizardHpLabel.setForeground(Color.white);
	  playerPanel.add(wizardHpLabel);
	  wizardLabelhp = new JLabel();
	  wizardLabelhp.setFont(normalFont);
	  wizardLabelhp.setForeground(Color.white);
	  playerPanel.add(wizardLabelhp);
	  window.setVisible(true);	  
	  
	  loser = new EndScreen();
	  loser.setBounds(0,0,800,706);
	  loser.setBackground(Color.black);
	  
	  loserScreen = new JTextArea("LOSERRRRRRRR hahahahaha. Cuellar was too difficult I see, now remember, stay cool but don't freeze");
	    loserScreen.setBounds(100, 100, 600, 150);
	    loserScreen.setBackground(new Color(0,0,0,0));
	    loserScreen.setForeground(Color.white);
	    loserScreen.setFont(normalFont);
	    loserScreen.setLineWrap(true);
	    loser.setImage(displayimage);
	    
	    loser.setText(loserScreen);
	    loser.setVisible(false);
	    	    
	    winner = new EndScreen();
	    winner.setBounds(0,0,800,1000);

	    //winner.setBackground(Color.black);
	    winner.setBackground(new Color(0,0,0,0));
	    
	    winnerScreen = new JTextArea("Winner Winner Chicken Dinner! WOOOP WOOOPPP;) now remember, stay cool but don't freeze");
	    winnerScreen.setBounds(100, 100, 600, 150);
	    winnerScreen.setBackground(new Color(0,0,0,0));
	    winnerScreen.setForeground(Color.white);
	    winnerScreen.setFont(normalFont);
	    winnerScreen.setLineWrap(true);
	    winner.setImage(displaymean);
	    winner.setText(winnerScreen);
	    winner.setVisible(false);
	    
	    con.add(loser);
	    con.add(winner);
	  
	  playStage();
  }
  
 

  public JButton choiceButton(String text) {
	  JButton button;
	  button = new JButton();
	  button.setBackground(Color.black);
	  
	  button.setForeground(Color.black);
	  button.setFont(normalFont);
	  button.setText(text);
	  return button; 
  }
 
  public class TitleScreenHandler implements ActionListener{
  	  public void actionPerformed(ActionEvent event) {
  		  
  		  createGameScreen();
   
  	}
  }
  
}