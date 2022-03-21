import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.Font;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.RootPaneContainer;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

import com.sun.jdi.IntegerValue;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JDayChooser;

class dane{
	
		static String log="";
		static String haslo="";
		static int id=0;
//		static int[] haslotab=new int [32];
	
}

class auto{
	
	static int auto=0;
	static int koszt=0;
	static int nrfaktury=0;
}

public class WypozyczalniaSamochodow extends JFrame{
	
	static WypozyczalniaSamochodow me;
	
	
	public WypozyczalniaSamochodow() {
        
		me = this;
	
	}
	
	

	public static void main(String[] args) throws IOException {
		
	
		lzbd2 log2 = new lzbd2();
		WypozyczalniaSamochodow window = new WypozyczalniaSamochodow();
		window.setTitle("Wypozyczalnia samochodow luksusowych");
		window.setDefaultCloseOperation(WypozyczalniaSamochodow.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.add(log2);
		window.pack();
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		JScrollPane scroll = new JScrollPane(log2); 
	     scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	     scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	     window.add(scroll);

	}

}

class lzbd2 extends JPanel{
	
	Image bg = ImageIO.read(new File("C:\\Users\\Kris\\Desktop\\Obrazki\\merc2.jpg"));
	Color c1 = new Color(41, 41, 41);
	
	Image s1 = ImageIO.read(new File("C:\\Users\\Kris\\Desktop\\Obrazki\\auta\\1.png"));
	Image s2 = ImageIO.read(new File("C:\\Users\\Kris\\Desktop\\Obrazki\\auta\\merccla45s.jpeg"));
	Image s3 = ImageIO.read(new File("C:\\Users\\Kris\\Desktop\\Obrazki\\auta\\audi_rsq8_01.jpg"));
	Image s4 = ImageIO.read(new File("C:\\Users\\Kris\\Desktop\\Obrazki\\auta\\mas.jpg"));
	Image s5 = ImageIO.read(new File("C:\\Users\\Kris\\Desktop\\Obrazki\\auta\\pana.jpg"));
	Image s6 = ImageIO.read(new File("C:\\Users\\Kris\\Desktop\\Obrazki\\auta\\por.jpg"));
	Image s7 = ImageIO.read(new File("C:\\Users\\Kris\\Desktop\\Obrazki\\auta\\ff.jpg"));
	Image s8 = ImageIO.read(new File("C:\\Users\\Kris\\Desktop\\Obrazki\\auta\\cabrio.png"));
	Image s9 = ImageIO.read(new File("C:\\Users\\Kris\\Desktop\\Obrazki\\auta\\s63.jpg"));
	Image s10 = ImageIO.read(new File("C:\\Users\\Kris\\Desktop\\Obrazki\\auta\\lam.jpg"));
	String s = "s";

	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(getSize().width, 3000);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
				g.setColor(Color.white);
				g.fillRect(0, 0, getSize().width, 3000);
//				g.drawImage(bg,0,0,getSize().width,800,null);
				
				
					g.drawImage(s1,100,300,330,220,null);
				
			 
	}
	
	public lzbd2() throws IOException{
		
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(100, 200, 1150, 50);
		panel2.setBackground(c1);
		add(panel2);
		 panel2.setLayout(null);
		 
		 JPanel panel3 = new JPanel();
			panel3.setBounds(550, 160, 200, 40);
			panel3.setBackground(c1);
			add(panel3);
			 panel3.setLayout(null);
			 
			 JPanel panel11 = new JPanel();
				panel11.setBounds(50, 10, 1250, 120);
				panel11.setBackground(c1);
				add(panel11);
				 panel11.setLayout(null);
		
		JLabel wyszukaj = new JLabel("Wyszukaj samochod");
		wyszukaj.setForeground(Color.white);
		wyszukaj.setBounds(20, 0, 400, 40);
		wyszukaj.setFont(new Font("Serif", Font.PLAIN, 20));
		panel3.add(wyszukaj);
	
		JLabel t10 = new JLabel("Wypozyczalnia samochodow luksusowych");
//		t1.setLocation((this.getWidth()-t1.getWidth())/2,100);
		t10.setForeground(Color.white);
		t10.setFont(new Font("Serif", Font.PLAIN, 70));
		t10.setBounds(30, 0, 1200, 100);
//		t10.setHorizontalAlignment(JLabel.CENTER);
//		t1.setHorizontalAlignment(JLabel.CENTER);
		panel11.add(t10);
		
	    JLabel cena = new JLabel("Cena za dobe:");
	    cena.setFont(new Font("Serif", Font.PLAIN, 16));
	    cena.setForeground(Color.white);
	    cena.setBounds(50, 10, 100, 20);
	    panel2.add(cena);
	    
	    JTextField t1,t2;  
	    t1=new JTextField("Od");  
	    t1.setBounds(150,10, 100,20);  
	    t2=new JTextField("Do");  
	    t2.setBounds(265,10, 100,20);  
	    panel2.add(t1); 
	    panel2.add(t2); 
	    
	    JLabel myslnik = new JLabel("-");
	    myslnik.setFont(new Font("Serif", Font.PLAIN, 16));
	    myslnik.setForeground(Color.white);
	    myslnik.setBounds(255, 10, 100, 20);
	    panel2.add(myslnik);
	    
	    JLabel Marka = new JLabel("Marka:");
	    Marka.setFont(new Font("Serif", Font.PLAIN, 16));
	    Marka.setForeground(Color.white);
	    Marka.setBounds(400, 10, 100, 20);
	    panel2.add(Marka);
	    
		String marki[]={"Wszystkie","Audi","BMW","Mercedes","Ferrari","Porshe"};        
	    JComboBox cb=new JComboBox(marki);    
	    cb.setBounds(470, 10, 100,20);    
	    panel2.add(cb);
	    
	    JLabel typ1 = new JLabel("Typ:");
	    typ1.setFont(new Font("Serif", Font.PLAIN, 16));
	    typ1.setForeground(Color.white);
	    typ1.setBounds(620, 10, 100, 20);
	    panel2.add(typ1);
	    
	    String typ[]={"Wszystkie","Sportowe","Luksusowe","Terenowe","Busy"};        
	    JComboBox cb1=new JComboBox(typ);    
	    cb1.setBounds(670, 10,100,20);    
	    panel2.add(cb1);

	    JButton button1 = new JButton("Wyszukaj");
	    button1.setBounds(1000, 10, 100, 20);
	    panel2.add(button1);
	    
	    JButton admin = new JButton("Panel administratora");
	    admin.setBounds(50, 2950, 200, 20);
	    add(admin);
	    
	    admin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lzbd o3 = null;
				try {
					o3 = new lzbd();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				WypozyczalniaSamochodow window = new WypozyczalniaSamochodow();
				window.setDefaultCloseOperation(WypozyczalniaSamochodow.EXIT_ON_CLOSE);
				window.setVisible(true);
				window.add(o3);
				window.pack();
				
			}
		});
	    
		
	    
	    DodawanieSamochodow();
		 
		 
	    
	    
	    
	   
	    setLayout(null);  
  
	}
	
	public void DodawanieSamochodow() {
		
		int trzysta = 300;
		
		 Connection c = null;
	      Statement stmt = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	        		 .getConnection("jdbc:postgresql://localhost:5432/postgres",
	     		            "postgres", "1qaz@WSX");
	         c.setAutoCommit(false);
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	         ResultSet rs = stmt.executeQuery( "SELECT * FROM cars;" );
	         while ( rs.next() ) {
	            int id = rs.getInt("id");
	            String  marka = rs.getString("marka");
	            String  model = rs.getString("model");
	            String  typ = rs.getString("typ");
	            String  paliwo = rs.getString("paliwo");
	            String  naped = rs.getString("naped");
	            String  skrzynia = rs.getString("skrzynia");
	            String  kolor = rs.getString("kolor");
	            int hp  = rs.getInt("hp");
	            int rok  = rs.getInt("rok");
	            String  tekst = rs.getString("tekst");
	            String  pelnanazwa = rs.getString("pelnanazwa");
	            int cena = rs.getInt("cena");
//	            System.out.println(id);
//	            System.out.println(marka);
//	            System.out.println(model);
//	            System.out.println(typ);
//	            System.out.println(paliwo);
//	            System.out.println(naped);
//	            System.out.println(skrzynia);
//	            System.out.println(kolor);
//	            System.out.println(hp);
//	            System.out.println(rok);
//	            System.out.println(tekst);
//	            System.out.println(cena);
//	            System.out.println();
	            
	            JPanel panel100 = new JPanel();
	            panel100.setBounds(450, trzysta, 400, 40);
	    		panel100.setBackground(c1);
	    		add(panel100);
	    		 panel100.setLayout(null);
	            
	            
	            JLabel pn = new JLabel(pelnanazwa,SwingConstants.CENTER);
	            pn.setForeground(Color.white);
	            pn.setFont(new Font("Serif", Font.PLAIN, 16));
	            pn.setBounds(0, 0, 400, 40);
	            panel100.add(pn);
	            
	            JLabel marka1 = new JLabel("Marka: "+marka);
	            marka1.setForeground(Color.black);
	            marka1.setFont(new Font("Serif", Font.PLAIN, 16));
	            marka1.setBounds(400, trzysta+50, 250, 20);
	            add(marka1);
	            
	            JLabel model1 = new JLabel("Model: "+model);
	            model1.setForeground(Color.black);
	            model1.setFont(new Font("Serif", Font.PLAIN, 16));
	            model1.setBounds(400, trzysta+80, 250, 20);
	            add(model1);
	            
	            JLabel typ1 = new JLabel("Typ: "+typ);
	            typ1.setForeground(Color.black);
	            typ1.setFont(new Font("Serif", Font.PLAIN, 16));
	            typ1.setBounds(400, trzysta+110, 250, 20);
	            add(typ1);
	            
	            JLabel hp1 = new JLabel("Liczba koni: "+hp+"km");
	            hp1.setForeground(Color.black);
	            hp1.setFont(new Font("Serif", Font.PLAIN, 16));
	            hp1.setBounds(400, trzysta+140, 250, 20);
	            add(hp1);
	            
	            JLabel kolor1 = new JLabel("Kolor: "+kolor);
	            kolor1.setForeground(Color.black);
	            kolor1.setFont(new Font("Serif", Font.PLAIN, 16));
	            kolor1.setBounds(400, trzysta+170, 250, 20);
	            add(kolor1);
	            
	            JLabel paliwo1 = new JLabel("Rodzaj paliwa: "+paliwo);
	            paliwo1.setForeground(Color.black);
	            paliwo1.setFont(new Font("Serif", Font.PLAIN, 16));
	            paliwo1.setBounds(650, trzysta+50, 250, 20);
	            add(paliwo1);
	            
	            JLabel naped1 = new JLabel("Naped: "+naped);
	            naped1.setForeground(Color.black);
	            naped1.setFont(new Font("Serif", Font.PLAIN, 16));
	            naped1.setBounds(650, trzysta+80, 250, 20);
	            add(naped1);
	            
	            JLabel skrzynia1 = new JLabel("Rodzaj skrzyni biegow: "+skrzynia);
	            skrzynia1.setForeground(Color.black);
	            skrzynia1.setFont(new Font("Serif", Font.PLAIN, 16));
	            skrzynia1.setBounds(650, trzysta+110, 250, 20);
	            add(skrzynia1);
	            
	            JLabel rok1 = new JLabel("Rok produkcji: "+rok);
	            rok1.setForeground(Color.black);
	            rok1.setFont(new Font("Serif", Font.PLAIN, 16));
	            rok1.setBounds(650, trzysta+140, 250, 20);
	            add(rok1);
	            
	            JPanel panel101 = new JPanel();
	            panel101.setBounds(950, trzysta+50, 250, 40);
	    		panel101.setBackground(c1);
	    		add(panel101);
	    		panel101.setLayout(null);
	    		 
	    		JLabel cena1 = new JLabel("Cena za dobe: "+String.valueOf(cena)+"zl",SwingConstants.CENTER);
		        cena1.setForeground(Color.white);
		        cena1.setFont(new Font("Serif", Font.PLAIN, 16));
		        cena1.setBounds(0, 0, 250, 40);
		        panel101.add(cena1);
		            
		         JButton wynajmij = new JButton("Wynajmij");
		         wynajmij.setBounds(950, trzysta+90, 250, 40);
		         add(wynajmij);
		         
		         wynajmij.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						lzbd o3 = null;
						try {
							o3 = new lzbd();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						auto.auto=id;
						System.out.println(auto.auto);
						WypozyczalniaSamochodow window = new WypozyczalniaSamochodow();
						window.setDefaultCloseOperation(WypozyczalniaSamochodow.EXIT_ON_CLOSE);
						window.setVisible(true);
						window.add(o3);
						window.pack();
						
					}
				});
	            
	            trzysta+=250;
	         }
	         rs.close();
	         stmt.close();
	         c.close();
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Operation done successfully");
		
		
	}
	
	
}

class okno5 extends JPanel{
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(400, 650);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
//		g.fillOval(0, 0, 100, 100);
		
		
	}
	
	public okno5(){
		
		JLabel l = new JLabel("Dane do faktury");
		l.setBounds(50, 20, 250, 40);
		l.setFont(new Font("Serif", Font.PLAIN, 20));
		add(l);
		
		JLabel l1 = new JLabel("Wybierz dzien rozpoczecia wynajmu:");
		l1.setBounds(50, 70, 250, 30);
		l1.setFont(new Font("Serif", Font.PLAIN, 16));
		add(l1);
		JLabel l2 = new JLabel("Wybierz dzien zakonczenia wynajmu :");
		l2.setBounds(50, 160, 250, 30);
		l2.setFont(new Font("Serif", Font.PLAIN, 16));
		add(l2);
		
		JDateChooser cal = new JDateChooser();
		cal.setBounds(50, 120, 200, 20);
		add(cal);
//		System.out.println(cal);
		JDateChooser cal1 = new JDateChooser();
		cal1.setBounds(50, 210, 200, 20);
		add(cal1);
//		System.out.println(cal1);
		
		JLabel l3 = new JLabel("Imie i nazwisko lub nazwa firmy:");
		l3.setBounds(50, 250, 250, 30);
		l3.setFont(new Font("Serif", Font.PLAIN, 16));
		add(l3);
		
		JTextField t1 = new JTextField();
		t1.setBounds(50, 300, 250, 30);
		add(t1);
		
		JLabel l4 = new JLabel("Adres:");
		l4.setBounds(50, 350, 250, 30);
		l4.setFont(new Font("Serif", Font.PLAIN, 16));
		add(l4);
		
		JTextField t2 = new JTextField();
		t2.setBounds(50, 400, 250, 30);
		add(t2);
		
		JLabel l5 = new JLabel("Kod pocztowy, miasto:");
		l5.setBounds(50, 450, 250, 30);
		l5.setFont(new Font("Serif", Font.PLAIN, 16));
		add(l5);
		
		JTextField t3 = new JTextField();
		t3.setBounds(50, 500, 250, 30);
		add(t3);
		
		JButton b1 = new JButton("Generuj fakture");
		b1.setBounds(100, 550, 200, 20);
		add(b1);
		b1.addActionListener(new ActionListener() {
			
		
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				java.util.Date date=new java.util.Date();  
				date=cal.getDate();
				java.util.Date date1=new java.util.Date();  
				date1=cal1.getDate();
				 Instant instant = Instant.ofEpochMilli(date.getTime());
				    LocalDateTime ldt = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
				    Instant instant1 = Instant.ofEpochMilli(date1.getTime());
				    LocalDateTime ldt1 = LocalDateTime.ofInstant(instant1, ZoneId.systemDefault());
				    long daysBetween = Duration.between(ldt, ldt1).toDays();
				    DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
				    String d1=dtf1.format(ldt);
				    String d2=dtf1.format(ldt1);
				    
				    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
				    LocalDateTime now = LocalDateTime.now(); 
				    String faktura = dtf.format(now)+"\n"+"\n";
				    faktura=ZbierzNrFaktury(faktura);
				    faktura+="Wypozyczalnia samochodow luksusowych"+"\n"+"ul. Szewska 20"+"\n"+"21-820, Krakow"+"\n"+"\n";
				    faktura+="Dane klienta: "+"\n"+t1.getText()+"\n"+t2.getText()+"\n"+t3.getText()+"\n"+"\n";
				    faktura+="Dane uslugi:"+"\n";
				    faktura=DaneAutaIKoszt(faktura);
				    int calkowityKoszt=auto.koszt*(int)daysBetween;
				    faktura+="Data odbioru: "+d1+"\n"+"Data zwrotu: "+d2+"\n"+"Koszt za dzien: "+auto.koszt+"zl"+"\n"+"Calkowity koszt: "+calkowityKoszt+"zl"+"\n"+"\n";
				    System.out.println(faktura);
				    PrintWriter pw;
					try {
						pw = new PrintWriter("C:\\Users\\Kris\\Desktop\\Faktura1.txt");
						pw.print(faktura);
						pw.close();
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					File lista = new File("C:\\Users\\Kris\\Desktop\\Faktura1.txt");
					String linia="";
					try {
						Scanner scan = new Scanner(lista);
						while(scan.hasNextLine()) {  
							linia += scan.nextLine() +" ";
						}
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					String dzienWystawienia =dtf1.format(now);
					dodanieFakturyDoBazyDanych(linia,dzienWystawienia);
					WypozyczalniaSamochodow.me.dispose();

				
			}
		});
		
		
		
		
		setLayout(null);
	
	}
	
	public String ZbierzNrFaktury(String faktura) {
		int obecnyNrFaktury=0;
		boolean tak=false;
		 Connection c = null;
	      Statement stmt = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	        		 .getConnection("jdbc:postgresql://localhost:5432/postgres",
	     		            "postgres", "1qaz@WSX");
	         c.setAutoCommit(false);
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	         ResultSet rs = stmt.executeQuery( "SELECT * FROM uzytkownicyfaktury1;" );
	         while ( rs.next() ) {
	            int NumerFaktury = rs.getInt("numerfaktury");
	            
	            if(obecnyNrFaktury<NumerFaktury) {
	            	obecnyNrFaktury=NumerFaktury;
	            }
	         }
	         rs.close();
	         stmt.close();
	         c.close();
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Operation done successfully");
		obecnyNrFaktury++;
		faktura+="Numer faktury: "+obecnyNrFaktury+"\n";
		auto.nrfaktury=obecnyNrFaktury;
		
		
		
		return faktura;
	}
	
	public String DaneAutaIKoszt(String faktura) {
		int obecnyNrFaktury=0;
		boolean tak=false;
		 Connection c = null;
	      Statement stmt = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	        		 .getConnection("jdbc:postgresql://localhost:5432/postgres",
	     		            "postgres", "1qaz@WSX");
	         c.setAutoCommit(false);
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	         ResultSet rs = stmt.executeQuery( "SELECT * FROM cars;" );
	         while ( rs.next() ) {
	        	 int id = rs.getInt("id");
		            String  marka = rs.getString("marka");
		            String  model = rs.getString("model");
		            String  typ = rs.getString("typ");
		            String  paliwo = rs.getString("paliwo");
		            String  naped = rs.getString("naped");
		            String  skrzynia = rs.getString("skrzynia");
		            String  kolor = rs.getString("kolor");
		            int hp  = rs.getInt("hp");
		            int rok  = rs.getInt("rok");
		            String  tekst = rs.getString("tekst");
		            String  pelnanazwa = rs.getString("pelnanazwa");
		            int cena = rs.getInt("cena");
		            
		            if(id==auto.auto) {
		            	faktura+="Marka: "+marka+"\n"+"Model: "+model+"\n"+"Pelna nazwa: "+pelnanazwa+"\n";
		            	auto.koszt=cena;
		            }
	         }
	         rs.close();
	         stmt.close();
	         c.close();
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Operation done successfully");
		
		
		
		
		return faktura;
	}
	
	public void dodanieFakturyDoBazyDanych(String faktura,String dzienWystawienia) {
		
		Connection c = null;
	      Statement stmt = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	        		 .getConnection("jdbc:postgresql://localhost:5432/postgres",
	     		            "postgres", "1qaz@WSX");
	         c.setAutoCommit(false);
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	         String sql = "INSERT INTO uzytkownicyfaktury1 (id, numerfaktury,trescfaktury, datawystawienia) values ("+dane.id+","+auto.nrfaktury+",'"+faktura+"','"+dzienWystawienia+"');";
	         stmt.executeUpdate(sql);
	         c.commit();
	         
	       
	         stmt.close();
	         c.close();
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Operation done successfully");
		
	}

}

class lzbd extends JPanel{
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(1100, 600);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillOval(0, 0, 100, 100);
		
			try {
				Image bg = ImageIO.read(new File("C:\\Users\\Kris\\Desktop\\Obrazki\\merc2.jpg"));
				Image sucess = ImageIO.read(new File("C:\\Users\\Kris\\Desktop\\Obrazki\\logins.png"));
				

				g.drawImage(bg,0,0,getSize().width,getSize().height,null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		
	}
	
	
	
	public lzbd() throws IOException{

		JButton button1 = new JButton("Zaloguj");
		button1.setBounds(350, 500, 100, 20);
		JButton button2 = new JButton("Zarejestruj");
		button2.setBounds(550, 500, 100, 20);
		JTextField login = new JTextField("");
		login.setBounds(550, 300, 100, 20);
		JTextField haslo = new JTextField("");
		haslo.setBounds(550, 400, 100, 20);
		JLabel log = new JLabel("Login:");
		log.setBounds(400, 300, 100, 20);
		Font f = new Font("monospaced", Font.ROMAN_BASELINE, 16);
		log.setForeground(Color.WHITE);
		log.setFont(f);
		JLabel has = new JLabel("Haslo:");
		has.setForeground(Color.WHITE);
		has.setFont(f);
		has.setBounds(400, 400, 100, 20);
		JLabel n = new JLabel("Nie pamietasz hasla?");
		n.setBounds(450, 550, 200, 20);
		JRootPane root = new JRootPane(); 
		root.setBounds(100, 100, 200, 200);
		 
		button1.addActionListener(new ActionListener() { 
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dane.log=login.getText();
				dane.haslo=haslo.getText();
				boolean tak=sprawdzenie();
				System.out.println(tak);
				if(tak==true) {
					JLabel zalogowany = new JLabel("Zalogowany");
					zalogowany.setBounds(550, 300, 100, 100);
//					setLayout(null);
					add(zalogowany);
					repaint();
					System.out.println("1");
				}
			}
		});
		
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				okno2 o2 = new okno2();
				WypozyczalniaSamochodow window2 = new WypozyczalniaSamochodow();
				window2.setDefaultCloseOperation(WypozyczalniaSamochodow.EXIT_ON_CLOSE);
				window2.setVisible(true);
				window2.add(o2);
				window2.pack();
			}
		});
		
	setLayout(null);  
     root.setVisible(true);  
	add(button1);
	add(button2);
	add(login);
	add(haslo);
	add(log);
	add(has);
	add(n);
	}
	
	
	public boolean sprawdzenie() {
		boolean tak=false;
		 Connection c = null;
	      Statement stmt = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	        		 .getConnection("jdbc:postgresql://localhost:5432/postgres",
	     		            "postgres", "1qaz@WSX");
	         c.setAutoCommit(false);
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	         ResultSet rs = stmt.executeQuery( "SELECT * FROM bazauzytkownikow;" );
	         while ( rs.next() ) {
	            int id = rs.getInt("id");
	            String  login = rs.getString("login");
	            String  haslo = rs.getString("haslo");
	            if(login.equals(dane.log)&&haslo.equals(dane.haslo)&&id==3) {
	            	tak=true;
	            	dane.id=id;
	            	
	            	WypozyczalniaSamochodow.me.dispose();
	            	okno22 o22 = new okno22();
					WypozyczalniaSamochodow window5 = new WypozyczalniaSamochodow();
					window5.setDefaultCloseOperation(WypozyczalniaSamochodow.EXIT_ON_CLOSE);
					window5.setVisible(true);
					window5.add(o22);
					window5.pack();
//					WypozyczalniaSamochodow.me.dispose();
					
	            
	            }
	            else  if(login.equals(dane.log)&&haslo.equals(dane.haslo)) {
	            	tak=true;
	            	dane.id=id;
	            	
	            	WypozyczalniaSamochodow.me.dispose();
	            	okno5 o5 = new okno5();
					WypozyczalniaSamochodow window5 = new WypozyczalniaSamochodow();
					window5.setDefaultCloseOperation(WypozyczalniaSamochodow.EXIT_ON_CLOSE);
					window5.setVisible(true);
					window5.add(o5);
					window5.pack();
//					WypozyczalniaSamochodow.me.dispose();
					
	            
	            }
	         }
	         rs.close();
	         stmt.close();
	         c.close();
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Operation done successfully");
	      
	      return tak;
	}
	
	 
}

class okno22 extends JPanel{
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(650, 650);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

	}
	
	public okno22(){
		
		JLabel panelAdmistratora = new JLabel("Panel admistratora");
		panelAdmistratora.setBounds(100, 20, 300, 50);
		panelAdmistratora.setFont(new Font("Serif", Font.PLAIN, 30));
		add(panelAdmistratora);
		
		JRadioButton r1=new JRadioButton("Miesiac");    
		JRadioButton r2=new JRadioButton("Rok");    
		r1.setBounds(50,100,100,30);    
		r2.setBounds(150,100,100,30);    
		ButtonGroup bg=new ButtonGroup();    
		bg.add(r1);bg.add(r2);    
		add(r1);
		add(r2);      
		
		JButton generuj = new JButton("Generuj faktury zbiorcze");
		generuj.setBounds(250, 100, 300, 30);
		add(generuj);
				
		generuj.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				LocalDateTime now = LocalDateTime.now(); 
				DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
			    String d1=dtf1.format(now);
			    System.out.println(d1);
			    String[] parts = d1.split("/");
	            String part1 = parts[0]; 
	            System.out.println(part1);
	            String part2 = parts[1]; 
	            String part3 = parts[2]; 
				
				
				if(r1.isSelected()){
					try {
						generujFakturyZaMiesiac(part2);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				if(r2.isSelected()){
					
					try {
						generujFakturyZaRok(part1);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				
				
			}
		});
		
		JLabel edycjaUzytkownikow = new JLabel("Edycja uzytkonikow");
		edycjaUzytkownikow.setBounds(50, 150, 250, 30);
		edycjaUzytkownikow.setFont(new Font("Serif", Font.PLAIN, 20));
		add(edycjaUzytkownikow);
		
		JTextField login = new JTextField("Login");
		login.setBounds(50, 200, 200, 30);
		add(login);
		
		JTextField haslo = new JTextField("Haslo");
		haslo.setBounds(300, 200, 200, 30);
		add(haslo);
		
		JButton dodajUzytkownika = new JButton("Dodaj uzykownika");
		dodajUzytkownika.setBounds(50, 250, 200, 30);
		add(dodajUzytkownika);
		
		dodajUzytkownika.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dodajUztkownika(login.getText(),haslo.getText());
				
			}
		});
		
		JLabel Edycja = new JLabel("Edycja uzytkownika");
		Edycja.setBounds(50, 300, 300, 30);
		Edycja.setFont(new Font("Serif", Font.PLAIN, 20));
		add(Edycja);
		
		
		JTextField idEdytuj = new JTextField("Wpisz ID uzytkownika");
		idEdytuj.setBounds(50, 350, 200, 30);
		add(idEdytuj);
		
		JTextField loginEdytuj = new JTextField("Zmieniony login");
		loginEdytuj.setBounds(50, 400, 200, 30);
		add(loginEdytuj);
		
		JTextField hasloEdytuj = new JTextField("Zmienione haslo");
		hasloEdytuj.setBounds(300, 400, 200, 30);
		add(hasloEdytuj);
		
		JButton Edytuj = new JButton("Edytuj");
		Edytuj.setBounds(50, 450, 200, 30);
		add(Edytuj);
		
		Edytuj.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				edycjaUzytkownika(idEdytuj.getText(),loginEdytuj.getText(),hasloEdytuj.getText());
				
			}
		});
		
		JLabel Usun = new JLabel("Usun uztkownika");
		Usun.setBounds(50, 500, 300, 30);
		Usun.setFont(new Font("Serif", Font.PLAIN, 20));
		add(Edycja);
		
		JTextField idUsun = new JTextField("Wpisz ID");
		idUsun.setBounds(50, 550, 200, 30);
		add(idUsun);
		
		JButton Usun1 = new JButton("Usun uzykownika");
		Usun1.setBounds(50, 600, 200, 30);
		add(Usun1);
		
		Usun1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				usunUzytkownika(idUsun.getText());
				
			}
		});
		
		
		  
		setLayout(null);
	}
	
	public void usunUzytkownika(String idUsun) {
		
		 Connection c = null;
	      Statement stmt = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	        		 .getConnection("jdbc:postgresql://localhost:5432/postgres",
	      		            "postgres", "1qaz@WSX");
	         c.setAutoCommit(false);
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	         String sql = "DELETE from bazauzytkownikow where id ="+idUsun+";";
	         System.out.println(sql);
	         stmt.executeUpdate(sql);
	         c.commit();
	        

	        
	         stmt.close();
	         c.close();
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Operation done successfully");
		
		
	}
	
	public void edycjaUzytkownika(String idString,String lodine, String hasloe) {
		
		 Connection c = null;
	      Statement stmt = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	        		 .getConnection("jdbc:postgresql://localhost:5432/postgres",
	      		            "postgres", "1qaz@WSX");
	         c.setAutoCommit(false);
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	         String sql = "UPDATE bazauzytkownikow set login ='"+lodine+"' where ID="+idString+";";
	         stmt.executeUpdate(sql);
	         String sql1 = "UPDATE bazauzytkownikow set haslo ='"+hasloe+"' where ID="+idString+";";
	         stmt.executeUpdate(sql1);
	         c.commit();

	        
	         stmt.close();
	         c.close();
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Operation done successfully");
		
	}
	
	public void dodajUztkownika(String dodajlogin, String dodajhaslo) {
		int najwyzszeId = 0;
		Connection c = null;
	      Statement stmt = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	        		 .getConnection("jdbc:postgresql://localhost:5432/postgres",
	     		            "postgres", "1qaz@WSX");
	         c.setAutoCommit(false);
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	         
	         ResultSet rs = stmt.executeQuery( "Select *\r\n"
	         		+ "From bazauzytkownikow;" );
	         while ( rs.next() ) {
	            int id = rs.getInt("id");
	            
	            if(id>najwyzszeId) {
	            	najwyzszeId=id;
	            }
	           
	         }
	         najwyzszeId++;
	         
	         
	         String sql = "INSERT INTO bazauzytkownikow (id, login,haslo) values ("+najwyzszeId+",'"+dodajlogin+"','"+dodajhaslo+"');";
	         stmt.executeUpdate(sql);
	         c.commit();
	         
	         rs.close();
	         stmt.close();
	         c.close();
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Operation done successfully");
		
		
	}
	
	public void generujFakturyZaMiesiac(String miesiac) throws FileNotFoundException {
		String fakturazbiorcza="";
		boolean tak=false;
		 Connection c = null;
	      Statement stmt = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	        		 .getConnection("jdbc:postgresql://localhost:5432/postgres",
	     		            "postgres", "1qaz@WSX");
	         c.setAutoCommit(false);
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	         ResultSet rs = stmt.executeQuery( "SELECT * FROM uzytkownicyfaktury1;" );
	         while ( rs.next() ) {
	        	 int id = rs.getInt("id");
	        	 int nrfaktury = rs.getInt("numerfaktury");
		            String  trescfaktury = rs.getString("trescfaktury");
		            String  datawystawienia = rs.getString("datawystawienia");
		            
		            String[] parts = datawystawienia.split("/");
		            String part1 = parts[0]; 
		            String part2 = parts[1]; 
		            String part3 = parts[2]; 
		            
		            if(miesiac.equalsIgnoreCase(part2)) {
		            	fakturazbiorcza+="ID Uzytkownika: "+String.valueOf(id)+" Numer faktury: "+String.valueOf(nrfaktury)+
		            			" Data wystawienia: "+datawystawienia+" Tresc faktury: "+trescfaktury+"\n";
		            }
	         }
	         rs.close();
	         stmt.close();
	         c.close();
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Operation done successfully");
	      PrintWriter pw;
	      pw = new PrintWriter("C:\\Users\\Kris\\Desktop\\FakturaMiesieczna.txt");
			pw.print(fakturazbiorcza);
			pw.close();
		
		
		return;
		
	}
	
	public void generujFakturyZaRok(String rok) throws FileNotFoundException {
		String fakturazbiorcza="";
		boolean tak=false;
		 Connection c = null;
	      Statement stmt = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	        		 .getConnection("jdbc:postgresql://localhost:5432/postgres",
	     		            "postgres", "1qaz@WSX");
	         c.setAutoCommit(false);
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	         ResultSet rs = stmt.executeQuery( "SELECT * FROM uzytkownicyfaktury1;" );
	         while ( rs.next() ) {
	        	 int id = rs.getInt("id");
	        	 int nrfaktury = rs.getInt("numerfaktury");
		            String  trescfaktury = rs.getString("trescfaktury");
		            String  datawystawienia = rs.getString("datawystawienia");
		            
		            String[] parts = datawystawienia.split("/");
		            String part1 = parts[0]; 
		            String part2 = parts[1]; 
		            String part3 = parts[2]; 
		            
		            if(rok.equalsIgnoreCase(part1)) {
		            	fakturazbiorcza+="ID Uzytkownika: "+String.valueOf(id)+" Numer faktury: "+String.valueOf(nrfaktury)+
		            			" Data wystawienia: "+datawystawienia+" Tresc faktury: "+trescfaktury+"\n";
		            }
	         }
	         rs.close();
	         stmt.close();
	         c.close();
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Operation done successfully");
	      PrintWriter pw;
	      pw = new PrintWriter("C:\\Users\\Kris\\Desktop\\FakturaRoczna.txt");
			pw.print(fakturazbiorcza);
			pw.close();
		
		
		return;
		
	}
	
}

class okno2 extends JPanel{
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(400, 400);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
//		g.fillOval(0, 0, 100, 100);
		
		
	}
	
	public okno2(){
		
//		JLabel log = new JLabel("Login:");
		JButton Zarejestruj = new JButton("Zarejestruj");
		Zarejestruj.setBounds(100, 300, 100, 20);
		JTextField login = new JTextField("");
		login.setBounds(200, 100, 100, 20);
		JTextField haslo = new JTextField("");
		haslo.setBounds(200, 200, 100, 20);
		JLabel log = new JLabel("Login:");
		log.setBounds(50, 100, 100, 20);
		JLabel pas = new JLabel("Haslo:");
		pas.setBounds(50, 200, 100, 20);
		JLabel dlahasla1 = new JLabel("");
		dlahasla1.setBounds(200, 220, 200, 20);
		JLabel dlahasla2 = new JLabel("");
		dlahasla2.setBounds(200, 240, 200, 20);
		JLabel dlahasla3 = new JLabel("");
		dlahasla3.setBounds(200, 260, 200, 20);
		JLabel dlahasla4 = new JLabel("");
		dlahasla4.setBounds(200, 280, 200, 20);
		JLabel dlahasla5 = new JLabel("");
		dlahasla5.setBounds(200, 300, 200, 20);
		JLabel dlaloginu = new JLabel("");
		dlaloginu.setBounds(200, 120, 200, 20);
		
		Zarejestruj.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String nazwa = login.getText();
				String hasloo = haslo.getText();
				boolean tak=sprawdzenieloginu(nazwa);
				String odpowiedz=sprawdzeniehasla(hasloo);
				if(odpowiedz.equalsIgnoreCase("silne")&&tak==true) {
					int id = sprawdzenieid();
					rejestracja(nazwa,hasloo,id);
					
					
				}
				else {
					if(odpowiedz.equalsIgnoreCase("silne")) {
					}
					else {
						dlahasla1.setText("Haslo musi zawierac:");
						dlahasla2.setText("-Jedna mala litere,");
						dlahasla3.setText("-Jedna duza litere,");
						dlahasla4.setText("-Cyfre lub znak specjalny,");
						dlahasla5.setText("-Posiadac przynjamniej 8 znakow.");
					}
					if(tak==false) {
						dlaloginu.setText("Prosze wpisac inny login.");
					}
				}
			}
		});
		
		setLayout(null);
		add(Zarejestruj);
		add(log);
		add(pas);
		add(login);
		add(haslo);
		add(dlahasla1);
		add(dlahasla2);
		add(dlahasla3);
		add(dlahasla4);
		add(dlahasla5);
		add(dlaloginu);
	}
	
	public boolean sprawdzenieloginu(String nazwa) {
		boolean tak=true;
		 Connection c = null;
	      Statement stmt = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	        		 .getConnection("jdbc:postgresql://localhost:5432/postgres",
	     		            "postgres", "1qaz@WSX");
	         c.setAutoCommit(false);
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	         ResultSet rs = stmt.executeQuery( "SELECT login FROM bazauzytkownikow;" );
	         while ( rs.next() ) {
	            String  login = rs.getString("login");
	            if(login.equals(nazwa)) {
	            	tak=false;
	            }
	         }
	         rs.close();
	         stmt.close();
	         c.close();
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Operation done successfully");
	      
	      return tak;
	}
	
	
//	CRUD -> CREATE< READ, UPDATE< DELETE
	
	
	public String sprawdzeniehasla(String hasloo) {
		boolean tak=true;
		int[] tab = new int[hasloo.length()];
		boolean a=false;
		boolean b=false;
		boolean c=false;
		String odpowiedz="";
		
		
		for(int i=0;i<hasloo.length();i++) {
			char ch=hasloo.charAt(i);
			int znak = (int)ch;
			if(znak>=48&&znak<=57) {
				tab[i]=2;
			}
			else if(znak>=65&&znak<=90) {
				tab[i]=1;
			}
			else if(znak>=97&&znak<=122) {
				tab[i]=1;
			}
			else 
				tab[i]=3;
				
		}
		int tmp=0;
		for(int i=0;i<tab.length;i++) {
			if(tab[i]==1) {
				a=true;
			}
			if(tab[i]==2) {
				b=true;
			}
			if(tab[i]==3) {
				c=true;
			}
		}
		if(a==true&&b==false&&c==false||a==false&&b==true&&c==false||a==false&&b==false&&c==true) {
			odpowiedz="Slabe";
		}
		if(a==true&&b==true&&c==false||a==true&&b==false&&c==true||a==false&&b==true&&c==true) {
			odpowiedz="Srednie";
		}
		if(a==true&&b==true&&c==true) {
			odpowiedz="Silne";
		}
		if(hasloo.length()<8) {
			odpowiedz="Haslo za krotkie";
		}
		tmp=0;
		
//	 	
		
		return odpowiedz;
	}
	
	public void rejestracja(String login,String haslo,int ID) {
		
		 Connection c = null;
	      Statement stmt = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	        		 .getConnection("jdbc:postgresql://localhost:5432/postgres",
	        		            "postgres", "1qaz@WSX");
	         c.setAutoCommit(false);
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	         String sql = "INSERT INTO bazauzytkownikow (id,login,haslo) "
	            + "VALUES ("+ID+", '"+login+"','"+haslo+"');";

	         stmt.executeUpdate(sql);

	         stmt.close();
	         c.commit();
	         c.close();
	      } catch (Exception e) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Records created successfully");
	   }
	
	public int sprawdzenieid() {
		boolean tak=true;
		 Connection c = null;
	      Statement stmt = null;
	      int ID=0;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	        		 .getConnection("jdbc:postgresql://localhost:5432/postgres",
	     		            "postgres", "1qaz@WSX");
	         c.setAutoCommit(false);
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	         ResultSet rs = stmt.executeQuery( "SELECT id FROM bazauzytkownikow;" );
	         while ( rs.next() ) {
	        	 int id = rs.getInt("id");
	            if(id>ID) {
	            	ID=id;
	            
	            }
	         }
	         rs.close();
	         stmt.close();
	         c.close();
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Operation done successfully");
	      
	      return ID+1;
	}
	
}


