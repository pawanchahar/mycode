import java.awt.*;
import java.awt.event.*;
class Calci implements ActionListener{
	Frame f;
	Button b,b7;
	TextField tf;
Calci()
{
 f=new Frame();
f.setTitle("CALCULATOR");
 tf=new TextField();
 tf.setBounds(10,30,340,60);
 f.add(tf);

 b=new Button("MC");
 b.setBounds(10,120,60,40);
 f.add(b);
b=new Button("MR");
 b.setBounds(80,120,60,40);
 f.add(b);
b=new Button("MS");
 b.setBounds(150,120,60,40);
 f.add(b);
b=new Button("M+");
 b.setBounds(220,120,60,40);
 f.add(b);
b=new Button("M-");
 b.setBounds(290,120,60,40);
 f.add(b);

b=new Button("<-");
 b.setBounds(10,190,60,40);
 f.add(b);
b=new Button("CE");
 b.setBounds(80,190,60,40);
 f.add(b);
b=new Button("C");
 b.setBounds(150,190,60,40);
 f.add(b);
b=new Button("=");
 b.setBounds(220,190,60,40);
 f.add(b);
b=new Button("SQRT");
 b.setBounds(290,190,60,40);
 f.add(b);

b7=new Button("7");
 b7.setBounds(10,250,60,40);
 f.add(b7);
 b7.addActionListener(this);

b=new Button("8");
 b.setBounds(80,250,60,40);
 f.add(b);
 b=new Button("9");
 b.setBounds(150,250,60,40);
 f.add(b);
 b=new Button("/");
 b.setBounds(220,250,60,40);
 f.add(b);
 b=new Button("%");
 b.setBounds(290,250,60,40);
 f.add(b);

b=new Button("4");
 b.setBounds(10,310,60,40);
 f.add(b);
b=new Button("5");
 b.setBounds(80,310,60,40);
 f.add(b);
 b=new Button("6");
 b.setBounds(150,310,60,40);
 f.add(b);
 b=new Button("*");
 b.setBounds(220,310,60,40);
 f.add(b);
 b=new Button("1/x");
 b.setBounds(290,310,60,40);
 f.add(b);

b=new Button("1");
 b.setBounds(10,370,60,40);
 f.add(b);
b=new Button("2");
 b.setBounds(80,370,60,40);
 f.add(b);
 b=new Button("3");
  b.setBounds(150,370,60,40);
 f.add(b);
 b=new Button("-");
  b.setBounds(220,370,60,40);
 f.add(b);
 b=new Button("=");
  b.setBounds(290,370,60,100);
 f.add(b);

b=new Button("0");
 b.setBounds(10,430,130,40);
 f.add(b);
 b=new Button(".");
  b.setBounds(150,430,60,40);
 f.add(b);
 bp=new Button("+");
  bp.setBounds(220,430,60,40);
 f.add(bp);
 bp.addActionListener(this);

 f.setLayout(null);
f.setSize(360,480);
f.setResizable(false);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e){
	//int s1=(parseInt)tf.getText();
	if(e.getSource()==b7)
	{
		tf.setText("7");
		}
	}

public static void main(String s[])
{
new Calci();
}
}
/*class MyListener implements ActionListener {
	Calci c;
	MyListener()
	{

		}void actionPerformed(ActionEvent e){
*/
