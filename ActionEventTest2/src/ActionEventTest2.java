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
		this.setTitle("�̺�Ʈ ����");
		//
		JPanel panel = new JPanel();
		button = new JButton("��ư�� �����ÿ�");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		button.addActionListener(new MyListener());
		panel.add(button);
		panel.add(label);
		//
		this.add(panel);
		this.setVisible(true);
		//
	}

	private class MyListener implements ActionListener {
		//private�� �������� �Ҽ��� �ȴٴ¸� 
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button) {
				//�� ��ư�̾�??
				label.setText("��ħ�� ��ư�� ���������ϴ�.");
			}
		}
	}
}
public class ActionEventTest2 {
	public static void main(String[] args) {
		MyFrame t = new MyFrame();
	}
}
//������ Ŭ������ ���� Ŭ������ �ۼ�