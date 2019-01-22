import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame extends JFrame {
	private JButton button;
	private JLabel label;
	
	public MyFrame() {
		//
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
		//
		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르시오");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다.");
		button.addActionListener(new MyListener());
		panel.add(button);
		panel.add(label);
		//
		this.add(panel);
		this.setVisible(true);
		//
	}

	private class MyListener implements ActionListener {
		//private은 누군가의 소속이 된다는말 
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button) {
				//너 버튼이야??
				label.setText("마침내 버튼이 눌려졌습니다.");
			}
		}
	}
}
public class ActionEventTest2 {
	public static void main(String[] args) {
		MyFrame t = new MyFrame();
	}
}
//리스너 클래스를 내부 클래스로 작성