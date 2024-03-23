/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 * 
 */

/*
 Students name:
 *  Shahad Al-jelaidan 2110669
 *  Rola Al-zahrani 2111645
*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class Menu extends JFrame {
    private  String Appetizers,MainCourse,Desserts,Drinks;// to hold the string value to be displayed in reciept

    public  double price,total,AppPrice=0,Mealprice=0,Dessprice=0,Driprice=0;//to calculate the price for each chosen radioButton with its quantity
    private JLabel message;
    private JTextField App_Quantity,Main_Quantity,Dess_Quantity,Drink_Quantity;// to take in the quantity input which is mandatory in the calculating process
    private JPanel panel,panel1;
    private JRadioButton ShrimpDyn,Mozzarelaa,Buffalo,fries;
    private JPanel panel2;
    private JRadioButton RedPasta,ChickenBurger,BeefBurger,ChickenTenders;
    private JPanel panel3;
    private JRadioButton CheeseCake,Brownie,ApplePie,LavaCake;
    private JPanel panel4;
    private JRadioButton SoftDrinks,IcedTea,Juice,Water;
    private JRadioButton nothing;
    private JPanel panel5;
    private JButton receipt;
     //used in images panel
    private ImageIcon image1,image2,image3,image4;
    private JLabel label1,label2,label3,label4,greetinglabel;
    //for the color object
    private Color darkblue,Purple;
 
    public Menu() {
        this.Appetizers="";//the reason why i did this so that when nothing is chosen it displays blank spot 
        this.MainCourse="";
	this.Desserts="";
	this.Drinks="";
        
	// I have created two color objects for background color
	darkblue= new Color(0,51,102 );
        Purple=new Color(204,204,255);
        
        //created the frame 
        setSize(1550,650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
	setLayout(new GridLayout(1,5));
        
         //added the images panel to window
        ImagesPanel();
        add(panel1);
	
        //added the appertize panel to window
	appetizerPanel();
	add(panel);
        
        //added the Main course panel to window
	MaincoursePanel();
	add(panel2);
        
        //added the dessert panel to window
	DessertPanel();
	add(panel3);
        
         //added the drinks panel to window
	DrinksPanel();
	add(panel4);
	
        //added the receipt panel to window
        ReceiptPanel();
	add(panel5);
	
	
	setVisible(true);
	
	}

	
    private void ImagesPanel(){
        /**
         this panel "panel1" contains the images 
         */
        panel1=new JPanel();
        panel1.setBackground(Purple);
         
         
         
        image1= new ImageIcon(getClass().getResource("chickenBurgerT.jpg"));
        label1= new JLabel(image1);
        panel1.add(label1);
        
        
        image2= new ImageIcon(getClass().getResource("REDPAS.jpg"));
        label2= new JLabel(image2);
        panel1.add(label2);
      
        
        
        image3= new ImageIcon(getClass().getResource("Strawberr_cheesecake.jpg"));
        label3= new JLabel(image3);
        panel1.add(label3);
        
        
        
    }
    
      /**
         * to set the string values of the chosen radioButtons to be printed on the receipt
         
         */
    public void setAppetizers(String appetizers) {
        Appetizers=appetizers;
    }

    public void setMainCourse(String main) {
        MainCourse=main;
		
    }
	
    public void setDesserts( String desserts) {
        Desserts=desserts;
		
    }
	
    public void setDrinks(String drinks) {
        Drinks=drinks;
		
    }
     /**
         * to return the string values of the chosen radioButtons to be printed on the receipt
         
         */
    public  String getAppetizers(){
        return Appetizers;
    }
    public  String getMainCourse(){
        return MainCourse;
    }
    public  String getDesserts(){
        return Desserts;
    }
    public  String getDrinks(){
        return Drinks;
    }
    
    /**
         i have created a panel "panel" which has the appetizer components
         * changed the background color, set a grid layout for the panel
         * created different radioButtons for each appetizer and grouped those radio buttons together 
         * created a message label to ask the user to specify the quantity which is a mandatory to get the receipt
         * the quantity is saved in App_Quantity which is used later for calculation
         * at last added all component on the panel which is added on the frame in constructor
         * same thing is applied to the other panels
         * same thing is applied for the other panels
         
         
         
         */
	
    private void appetizerPanel() {
        panel= new JPanel();
        panel.setBackground(Purple);
        panel.setLayout(new GridLayout(7,1));
                
	ShrimpDyn=new JRadioButton("Shrimp Dynamite  35.5 SR");
        ShrimpDyn.setForeground(Color.WHITE);
        ShrimpDyn.setBackground(darkblue);
                
	Mozzarelaa=new JRadioButton("Mozzarela sticks  18.5 SR");
        Mozzarelaa.setForeground(Color.WHITE);
        Mozzarelaa.setBackground(darkblue);
                
	Buffalo=new JRadioButton("Buffalo Wings  30 SR");
        Buffalo.setForeground(Color.WHITE);
        Buffalo.setBackground(darkblue);
                
	fries=new JRadioButton("French Fries  15.5 SR");
        fries.setForeground(Color.WHITE);
        fries.setBackground(darkblue);
                
	nothing=new JRadioButton("No appetizer");
        nothing.setForeground(Color.WHITE);
        nothing.setBackground(darkblue);
                
	message= new JLabel("Please enter quantity for the Appetizer");
        
            
	App_Quantity=new JTextField(5);
        App_Quantity.setBackground(darkblue);
        App_Quantity.setForeground(Color.white);
                
	ButtonGroup bg=new ButtonGroup();
	bg.add(ShrimpDyn);
	bg.add(Mozzarelaa);
	bg.add(Buffalo);
	bg.add(fries);
	bg.add(nothing);
                
	panel.setBorder(BorderFactory.createTitledBorder("Appetizzers"));
	panel.add(ShrimpDyn);
	panel.add(Mozzarelaa);
	panel.add(Buffalo);  
	panel.add(fries);
	panel.add(nothing);
	panel.add(message);
	panel.add(App_Quantity);
    }
    private void MaincoursePanel() {
        panel2= new JPanel();
        panel2.setBackground(Purple);
	panel2.setLayout(new GridLayout(7,1));
                
	RedPasta=new JRadioButton("Red Pasta  55 SR");
        RedPasta.setForeground(Color.WHITE);
        RedPasta.setBackground(darkblue);
                
	ChickenBurger=new JRadioButton("Chicken Burger  60 SR");
        ChickenBurger.setForeground(Color.WHITE);
        ChickenBurger.setBackground(darkblue);
                
	BeefBurger=new JRadioButton("Beef Burger  65 SR");
        BeefBurger.setForeground(Color.WHITE);
        BeefBurger.setBackground(darkblue);
                
	ChickenTenders=new JRadioButton("ChickenTenders  45.5 SR");
        ChickenTenders.setForeground(Color.WHITE);
        ChickenTenders.setBackground(darkblue);
                
	nothing=new JRadioButton("No Main Course");
        nothing.setForeground(Color.WHITE);
        nothing.setBackground(darkblue);
                
	message= new JLabel("Please enter quantity for the  Main Course");
           
                 
	Main_Quantity=new JTextField(5);
        Main_Quantity.setBackground(darkblue);
        Main_Quantity.setForeground(Color.white);
                
	ButtonGroup bg=new ButtonGroup();
	bg.add(RedPasta);
	bg.add(ChickenBurger);
	bg.add(BeefBurger);
	bg.add(ChickenTenders);
	bg.add(nothing);
	
	panel2.setBorder(BorderFactory.createTitledBorder("Main Course"));
	panel2.add(RedPasta);
	panel2.add(ChickenBurger);
	panel2.add(BeefBurger);  
	panel2.add(ChickenTenders);
	panel2.add(nothing);
	panel2.add(message);
	panel2.add(Main_Quantity);
    }
    private void DessertPanel() {
        panel3= new JPanel();
        panel3.setBackground(Purple);
	panel3.setLayout(new GridLayout(7,1));
                
	CheeseCake=new JRadioButton("CheeseCake  25.5 SR");
        CheeseCake.setForeground(Color.WHITE);
        CheeseCake.setBackground(darkblue);
                
	Brownie=new JRadioButton("Brownie  30.5 SR");
        Brownie.setForeground(Color.WHITE);
        Brownie.setBackground(darkblue);
                
	ApplePie=new JRadioButton("ApplePie  22 SR");
        ApplePie.setForeground(Color.WHITE);
        ApplePie.setBackground(darkblue);
                
	LavaCake=new JRadioButton("Lava Cake  30.5 SR");
        LavaCake.setForeground(Color.WHITE);
        LavaCake.setBackground(darkblue);
                
	nothing=new JRadioButton("No Dessert");
        nothing.setForeground(Color.WHITE);
        nothing.setBackground(darkblue);
                
	message= new JLabel("Please enter quantity for the Dessert");
               
	Dess_Quantity=new JTextField(5);
        Dess_Quantity.setBackground(darkblue);
        Dess_Quantity.setForeground(Color.white);
                
	ButtonGroup bg=new ButtonGroup();
	bg.add(CheeseCake);
	bg.add(Brownie);
	bg.add(ApplePie);
	bg.add(LavaCake);
	bg.add(nothing);
                
	panel3.setBorder(BorderFactory.createTitledBorder("Dessert"));
	panel3.add(CheeseCake);
	panel3.add(Brownie);
	panel3.add(ApplePie);  
        panel3.add(LavaCake);
	panel3.add(nothing);
        panel3.add(message);
	panel3.add(Dess_Quantity);
	}
    private void DrinksPanel(){
        panel4= new JPanel();
        panel4.setBackground(Purple);
	panel4.setLayout(new GridLayout(7,1));
                
	SoftDrinks=new JRadioButton("SoftDrinks  6 SR");
        SoftDrinks.setForeground(Color.WHITE);
        SoftDrinks.setBackground(darkblue);
                
	IcedTea=new JRadioButton("Iced Tea  10 SR");
        IcedTea.setForeground(Color.WHITE);
        IcedTea.setBackground(darkblue);
                
	Juice=new JRadioButton(" Juice  10 SR");
        Juice.setForeground(Color.WHITE);
        Juice.setBackground(darkblue);
                
	Water=new JRadioButton("Water  2 SR");
        Water.setForeground(Color.WHITE);
        Water.setBackground(darkblue);
                
	nothing=new JRadioButton("No Drink");
        nothing.setForeground(Color.WHITE);
        nothing.setBackground(darkblue);
                
	Drink_Quantity=new JTextField(5);
        Drink_Quantity.setBackground(darkblue);
        Drink_Quantity.setForeground(Color.white);
                
	message= new JLabel("Please enter quantity for the chosen Drink");
                 
	ButtonGroup bg=new ButtonGroup();
	bg.add(SoftDrinks);
        bg.add(IcedTea);
	bg.add(Juice);
        bg.add(LavaCake);
	bg.add(nothing);
             
        panel4.setBorder(BorderFactory.createTitledBorder("Dessert"));
	panel4.add(SoftDrinks);
        panel4.add(IcedTea);
	panel4.add(Juice);  
        panel4.add(Water);
	panel4.add(nothing);
        panel4.add(message);
	panel4.add(Drink_Quantity);
    }
    private void ReceiptPanel() {
        panel5= new JPanel();
        panel5.setBackground(Purple);
                 
        image4= new ImageIcon(getClass().getResource("FR (3).jpg"));
        label4= new JLabel(image4);
         
        
                
                
	receipt= new JButton("Display Receipt");
         // when the display receipt is clicked a JOptionPane will display the total,what's chosen and its price
        receipt.setBackground(darkblue);
        receipt.setForeground(Color.white);
                
	receipt.addActionListener(new ButtonListener());
                
	panel5.add(label4);
	panel5.add(receipt);
    }
    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e ){
            Menu food=new Menu();
            if(ShrimpDyn.isSelected()) {
                AppPrice=35.5*(  Double.parseDouble(App_Quantity.getText()) );// will calulate the price of the chosen appetizer with the quantity
		food.setAppetizers("Shrimp Dynamite");
            }else if(Mozzarelaa.isSelected()) {
		AppPrice=18.5*( Double.parseDouble(App_Quantity.getText()) );
		food.setAppetizers("Mozzarelaa Sticks");
            }else if(Buffalo.isSelected()) {
		AppPrice=30.0*( Double.parseDouble(App_Quantity.getText()) );
		food.setAppetizers("Buffalo Wings");
            }else if(fries.isSelected()) {
		AppPrice=15.5*( Double.parseDouble(App_Quantity.getText()) );
		food.setAppetizers("French Fries");
            }else if(nothing.isSelected()) {
                AppPrice=0.0;
            }
            if(RedPasta.isSelected()) {
                Mealprice=55.0*(  Double.parseDouble(Main_Quantity.getText())  );
		food.setMainCourse("Red Pasta");
            }else if(ChickenBurger.isSelected()) {
                Mealprice=60.0*( Double.parseDouble(Main_Quantity.getText()) );
		food.setMainCourse("Chicken Burger");
            }else if(BeefBurger.isSelected()) {
                Mealprice=65.0*( Double.parseDouble(Main_Quantity.getText()) );
		food.setMainCourse("Beef Burger");
            }else if(ChickenTenders.isSelected()) {
                Mealprice=45.5*( Double.parseDouble(Main_Quantity.getText()) );
		food.setMainCourse("Chicken Tenders");
            }else if(nothing.isSelected()) {
                Mealprice=0.0;
            }
            if(CheeseCake.isSelected()) {
		Dessprice=25.5*(  Double.parseDouble(Dess_Quantity.getText())  );
		food.setDesserts("CheeseCake");
            }else if(Brownie.isSelected()) {
		Dessprice=30.5*( Double.parseDouble(Dess_Quantity.getText()) );
		food.setDesserts("Brownie");
            }else if(ApplePie.isSelected()) {
		Dessprice=22.0*( Double.parseDouble(Dess_Quantity.getText()) );
		food.setDesserts("Apple Pie");
            }else if(LavaCake.isSelected()) {
		Dessprice=30.5*( Double.parseDouble(Dess_Quantity.getText()) );
                food.setDesserts("Lava Cake");
            }else if(nothing.isSelected()) {
		Dessprice=0.0;
            }
            if(SoftDrinks.isSelected()) {
                Driprice=6.0*(  Double.parseDouble(Drink_Quantity.getText())  );
		food.setDrinks("Soft Drink");
            }else if(IcedTea.isSelected()) {
		Driprice=10.0*( Double.parseDouble(Drink_Quantity.getText()) );
		food.setDrinks("Iced Tea");
            }else if(Juice.isSelected()) {
		Driprice=10.0*( Double.parseDouble(Drink_Quantity.getText()) );
		food.setDrinks("Juice");
            }else if(Water.isSelected()) {
		Driprice=2.0*( Double.parseDouble(Drink_Quantity.getText()) );
		food.setDrinks("Water");
            }else if(nothing.isSelected()) {
                Driprice=0.0;
            }
            total=total+AppPrice+Mealprice+Dessprice+Driprice;
            
            JOptionPane.showMessageDialog(null,"************ Receipt ************" +"\n Your total is     "+total+"SR"+" \n\nYou Chose: \n"+
                    " "+food.getAppetizers()+"   "+AppPrice+"\n"+" "+food.getMainCourse()+"   "+Mealprice+"\n"+" "+food.getDesserts()+"   "+Dessprice+
                    "\n"+" "+food.getDrinks()+"   "+Driprice+ "\n\nYour order will be ready for pickup");
            dispose();
        }
    }
    public static void main(String[] args){
        Menu m = new Menu();
        
    }
}