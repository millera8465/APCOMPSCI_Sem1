
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class paint {
	public static void main(String[] args){
		Icon iconRed = new ImageIcon("Red.jpg");
		Icon iconOrange = new ImageIcon("Orange.jpg");
		Icon iconYellow = new ImageIcon("Yellow.jpg");
		Icon iconGreen = new ImageIcon("Green.jpg");
		Icon iconBlue = new ImageIcon("Blue.jpg");
		Icon iconPurple = new ImageIcon("Purple.jpg");
		Icon iconGrey = new ImageIcon("Grey.jpg");
		Icon iconBlack = new ImageIcon("Black.jpg");
		Icon iconErase = new ImageIcon("Eraser.jpg");
		//These will be the images for our colors.
		
		JFrame frame = new JFrame("Drawing is fun!");
		
		Container content = frame.getContentPane();
		//Creates a new container
		content.setLayout(new BorderLayout());
		//sets the layout
		
		final PadDraw drawPad = new PadDraw();
		//creates a new padDraw, which is pretty much the paint program
		
		content.add(drawPad, BorderLayout.CENTER);
		//sets the padDraw in the center
		
		JPanel panel = new JPanel();
		//creates a JPanel
		panel.setPreferredSize(new Dimension(32, 68));
		panel.setMinimumSize(new Dimension(32, 68));
		panel.setMaximumSize(new Dimension(32, 68));
		//This sets the size of the panel
		
		JButton clearButton = new JButton("Clear");
		//creates the clear button and sets the text as "Clear"
		clearButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawPad.clear();
			}
		});
		//this is the clear button, which clears the screen.  This pretty
		//much attaches an action listener to the button and when the
		//button is pressed it calls the clear() method
		
		JButton redButton = new JButton(iconRed);
		//creates the red button and sets the icon we created for red
		redButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawPad.red();
			}

		});
		//when pressed it will call the red() method.  So on and so on =]
		
		JButton orangeButton = new JButton(iconOrange);
		orangeButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawPad.orange();
			}
		});
		
		JButton yellowButton = new JButton(iconYellow);
		yellowButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawPad.yellow();
			}
		});
		
		JButton greenButton = new JButton(iconGreen);
		//green button
		greenButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawPad.green();
			}
		});
		
		JButton blueButton = new JButton(iconBlue);
		//blue button
		blueButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawPad.blue();
			}
		});
		
		JButton purpleButton = new JButton(iconPurple);
		purpleButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawPad.purple();
			}
		});
		
		JButton greyButton = new JButton(iconGrey);
		greyButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawPad.grey();
			}
		});
		
		JButton blackButton = new JButton(iconBlack);
		blackButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				drawPad.black();
			}
		});
		
		JButton eraseButton = new JButton(iconErase);
		eraseButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				drawPad.erase();
			}
		});
		
		JComboBox penSize = new JComboBox();
		penSize.addItem("Thin");
		penSize.addItem("Medium");
		penSize.addItem("Thick");
		
		ActionListener sizeActionListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String size = (String) penSize.getSelectedItem();
				drawPad.changeThickness(size);
			}
		};
		penSize.addActionListener(sizeActionListener);
		
		redButton.setPreferredSize(new Dimension(16, 16));
		orangeButton.setPreferredSize(new Dimension(16, 16));
		yellowButton.setPreferredSize(new Dimension(16, 16));
		greenButton.setPreferredSize(new Dimension(16,16));
		blueButton.setPreferredSize(new Dimension(16, 16));
		purpleButton.setPreferredSize(new Dimension(16, 16));
		greyButton.setPreferredSize(new Dimension(16, 16));
		blackButton.setPreferredSize(new Dimension(16, 16));
		eraseButton.setPreferredSize(new Dimension(16,16));
		//sets the sizes of the buttons
		
		panel.add(redButton);
		panel.add(orangeButton);
		panel.add(yellowButton);
		panel.add(greenButton);
		panel.add(blueButton);
		panel.add(purpleButton);
		panel.add(greyButton);
		panel.add(blackButton);
		panel.add(eraseButton);
		panel.add(penSize);
		panel.add(clearButton);
		
		//adds the buttons to the panel
		
		content.add(panel, BorderLayout.NORTH);
		//sets the panel to the left
		
		frame.setSize(300, 300);
		//sets the size of the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//makes it so you can close
		frame.setVisible(true);
		//makes it so you can see it
	}
}


class PadDraw extends JComponent{
	private String thickness;
	Image image;
	//this is gonna be your image that you draw on
	Graphics2D graphics2D;
	//this is what we'll be using to draw on
	int currentX, currentY, oldX, oldY;
	//these are gonna hold our mouse coordinates

	//Now for the constructors
	public PadDraw(){
		setDoubleBuffered(false);
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				oldX = e.getX();
				oldY = e.getY();
			}
		});
		//if the mouse is pressed it sets the oldX & oldY
		//coordinates as the mouses x & y coordinates
		addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseDragged(MouseEvent e){
				currentX = e.getX();
				currentY = e.getY();
				graphics2D.drawLine(oldX, oldY, currentX, currentY);
				repaint();
				oldX = currentX;
				oldY = currentY;
			}

		});
		//while the mouse is dragged it sets currentX & currentY as the mouses x and y
		//then it draws a line at the coordinates
		//it repaints it and sets oldX and oldY as currentX and currentY
	}

	public void paintComponent(Graphics g){
		if(image == null){
			image = createImage(getSize().width, getSize().height);
			graphics2D = (Graphics2D)image.getGraphics();
			graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			clear();

		}
		g.drawImage(image, 0, 0, null);
	}
	//this is the painting bit
	//if it has nothing on it then
	//it creates an image the size of the window
	//sets the value of Graphics as the image
	//sets the rendering
	//runs the clear() method
	//then it draws the image


	public void clear(){
		graphics2D.setPaint(Color.WHITE);
		graphics2D.fillRect(0, 0, getSize().width, getSize().height);
		graphics2D.setPaint(Color.BLACK);
		repaint();
	}
	//this is the clear
	//it sets the colors as white
	//then it fills the window with white
	//thin it sets the color back to black
	public void red(){
		graphics2D.setPaint(new Color(252,0,0));
		repaint();
	}
	public void orange(){
		graphics2D.setPaint(new Color(224,123,0));
		repaint();
	}
	public void yellow(){
		graphics2D.setPaint(new Color(252,248,0));
		repaint();
	}
	public void green(){
		graphics2D.setPaint(new Color(0,153,0));
		repaint();
	}
	public void blue(){
		graphics2D.setPaint(new Color(0,4,252));
		repaint();
	}
	public void purple(){
		graphics2D.setPaint(new Color(137,0,179));
		repaint();
	}
	public void grey(){
		graphics2D.setPaint(new Color(92,92,92));
		repaint();
	}
	public void black(){
		graphics2D.setPaint(Color.BLACK);
		repaint();
	}
	public void erase(){
		graphics2D.setPaint(Color.WHITE);
		repaint();
	}
	public void changeThickness(String t) {
		thickness = t;
		float width = 3;
		if (thickness.equals("Thick")) width = 3;
		if (thickness.equals("Medium")) width = 2;
		if (thickness.equals("Thin")) width = 1;
		graphics2D.setStroke(new BasicStroke(width));
	}
}
