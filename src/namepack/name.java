package namepack;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class name {

	private JFrame frmNameAnalyzer;
	JTextArea outputarea = new JTextArea();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					name window = new name();
					window.frmNameAnalyzer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private int getCharValue (char ch) {
		switch(Character.toLowerCase(ch)) {
		case 'a':
		case 'j':
		case 's':
			return 1;
		case 'b':
		case 'k':
		case 't':
			return 2;
        case 'c':
        case 'l':
        case 'u':
            return 3;
        case 'd':
        case 'm':
        case 'v':
            return 4;
        case 'e':
        case 'n':
        case 'w':
            return 5;
        case 'f':
        case 'o':
        case 'x':
            return 6;
        case 'g':
        case 'p':
        case 'y':
            return 7;
        case 'h':
        case 'q':
        case 'z':
            return 8;

        case 'i':
        case 'r':

            return 9;
		
		default:
            return 0;
		}
		
		
	}	
	
	/**
	 * Create the application.
	 */
	public name() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		outputarea.setLineWrap(true); // line wrap
		outputarea.setWrapStyleWord(true); // word wrap
		frmNameAnalyzer = new JFrame();
		frmNameAnalyzer.setTitle("Name Analyzer");
		frmNameAnalyzer.setBounds(100, 100, 404, 384);
		frmNameAnalyzer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNameAnalyzer.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Your Name");
		lblNewLabel.setBounds(10, 11, 100, 14);
		frmNameAnalyzer.getContentPane().add(lblNewLabel);
		
		JTextArea entername = new JTextArea();
		entername.setBounds(10, 26, 282, 28);
		frmNameAnalyzer.getContentPane().add(entername, BorderLayout.NORTH);
		
		
		outputarea.setBounds(10, 60, 368, 274);
		frmNameAnalyzer.getContentPane().add(outputarea);
		
		JButton btnNewButton = new JButton("Analyze");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input =  entername.getText();
				if(!input.isEmpty()) {
					String outputtext = input+" is most likely :\n";
					
					outputarea.setText(outputtext);
					analyze(input);
				}
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(296, 26, 82, 28);
		frmNameAnalyzer.getContentPane().add(btnNewButton);
		
	}
	private void analyze(String name)
	{
		int[] sum = new int[1000];
		int count = 0;
		int x = name.length();
		
		for(int i =0;i<x;i++) {
			char ch = name.charAt(i);
			int num = getCharValue(ch);
			sum[count]= num;
			count++;
		}
		int totalsum = 0;
		for(int i = 0;i<count;i++) {
			totalsum+= sum[i];
		}
		while(totalsum>9 && totalsum!=11 && totalsum!=22 && totalsum!=33 ) {
			totalsum = (totalsum/10)+ (totalsum%10);
		}
		
		switch (totalsum) {
        case 1:
        	outputarea.append("\nYour are confidence and worry can plague those born with it. This can mean that you struggle with trusting and sharpening your unique skills. But, if you can overcome this, you will be able to channel your intuition and maximize your emotional awareness of the world around you.\nYou can become incredibly spiritual, especially since these energies are coursing your veins every single day. You usually believe in a higher power -- but that has more to do with accessing higher truths about life than following the dogma of organized religion.");
            break;

        case 2:
        	outputarea.append("\nPeople were blessed with beautiful hearts that they use to bring beautiful relationships into their lives.\nFrom romantic and business partnerships to family and friendships, these bonds are the most valuable thing in life to a person . They thrive in being part of a team and will do everything in their power to make it a happy, easy, and successful union. They are incredibly giving and do well at creating long-lasting connections with others.");
            break;

        case 3:
        	outputarea.append("\nCharming, romantic, and full of creative energy, and know how to embrace life! They tend to see the world through rose-colored lenses where everything looks like an opportunity and the chances for expression and enjoyment are endless. They have a tendency to be skilled communicators and have a knack for coming up with and sharing brilliant ideas. They makes an excellent journalist, blogger, social media influencer, or author.");
            break;

        case 4:
        	outputarea.append("\nDedicated, patient, down to earth, and hard-working, and they are a great source of stability in our world. They aren't interested in rocking the boat because they know that constant, steady effort is the surest path to their goals. Life Path 4 people are consistent in their methods and their moods and they keep themselves composed. They experience a range of emotions just like everyone else, but their practical way of processing their feelings keeps them from going to extremes.");
            break;

        case 5:
        	outputarea.append("\nPeople are on a lifelong adventure. They are ready for anything and want to soak up every experience this world has to offer. They tend to learn by living and don't allow themselves to get stuck in any situation that has outworn its interest. The moment things start to get humdrum, a person with this Life Path will move on to something more fascinating.");
            break;

        case 6:
        	outputarea.append("\nPeople embrace their emotions and lead with their heart. They give off a warm and inviting energy that others want to be around. They enjoy many rich relationships throughout their life, both romantic and friendly. Whether these Life Path people encounter someone who is just like them or someone who is entirely different, they will treat them the same: with kindness, respect, and support. Some Life Path numbers only see black and white, They can see and accept the infinite shades of grey between.");
            break;

        case 7:
        	outputarea.append("\nYou are eternal students of the universe. They are introspective individuals with an unquenchable thirst for knowledge and they enjoy looking into the inner workings of things. Someone with this Life Path is a true thinker who lets their mind lead the way. Pretty much from the moment of birth, they are able to skillfully combine the exacting side of their brain with their divine intuitive side to learn about, process, and make sense of life itself.");
            break;

        case 8:
        	outputarea.append("\nPersonality is one of hard work and hard lessons. People born with this Life Path number get their worth from accomplishing great things -- the bigger the goal, the more satisfying it feels when they achieve it. Money and material goods are important to them because they are rewards and reminders of all the effort put in. People with this Life Path direct all their energy into creating a life of success and abundance.");
            break;
        case 9:
        	outputarea.append("\nThere's a special kind of magic that follows people born. They embody the wisdom of a sage, but not by chance -- they have fought their way through many challenges to reach this point and have gained immeasurable strength and awareness along the way. They will often find themselves in a position of providing support and advice and this feels natural to them. The knowledge they have gained can be incredibly valuable to others on their own journeys.");
            break;
        case 11:
        	outputarea.append("\nYou are considered a \"Master Number\" in numerology if your Life Path number is 11. This designation signifies strong intuition, psychic abilities, and a deep connection to spirituality. You possess high sensitivity, empathy, and a thirst for spiritual knowledge. Balancing your spiritual pursuits with practical responsibilities can be challenging, but you have the potential for profound personal transformation and the ability to inspire others on their spiritual journeys.");
            break;
        case 22:
        	outputarea.append("\nYou are often referred to as a \"Master Builder\" in numerology. You possess exceptional practical and visionary abilities. You have the potential to turn grand ideas into reality through hard work and dedication. You are highly ambitious, goal-oriented, and capable of making a significant impact on the world. However, you may also face challenges in balancing your ambitious goals with practical execution..");
            break;
        case 33:
        	outputarea.append("\nYou are often referred to as a \"Master Teacher\" in numerology. You possess profound wisdom, compassion, and a deep desire to uplift and guide others. You have a unique ability to inspire and make a positive impact on the lives of those around you. Your nurturing and caring nature make you a natural healer and mentor. However, you may face challenges in maintaining balance between your desire to serve others and your personal needs.");
            break;

        default:
            break;
    }
	}
}
	

