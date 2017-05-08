
package tongab;

import java.awt.*;        
import java.awt.event.*;

public abstract class tongab extends Frame implements ActionListener{

  Button btnkq;
  TextField txtA,txtB,txtKQ;
  Label lblhd,lblA,lblB,lblKQ;
  public tongab()
 {
setLayout(new FlowLayout());
lblhd=new Label("       TÍNH TỔNG HAI SỐ NGUYÊN            ");
this.add(lblhd);
lblA=new Label("  Nhập số thứ nhất      ");
this.add(lblA);
txtA=new TextField(17);
this.add(txtA);

lblB=new Label("    Nhập số thứ  hai      ");
this.add(lblB);
txtB=new TextField(17);
this.add(txtB);
lblKQ=new Label("                            Kết quả :  ");
this.add(lblKQ);
txtKQ=new TextField(17);
this.add(txtKQ);
txtKQ.setEditable(false);
btnkq=new Button("Kết quả");
btnkq.addActionListener(this);
this.add(btnkq);
 }
   

           public void actionPerformed(ActionEvent e)
           {
            int a=Integer.parseInt(txtA.getText());
            int b=Integer.parseInt(txtB.getText());
            int c=a+b;
            txtKQ.setText(c+"");
            }
     
public static void main(String[] args)
{
    tongab test=new tongab() {};
      
    
    test.setTitle("tính tổng hai số");
    test.setSize(380,200);
    test.setVisible(true);
}
}

  

   


