import java.awt.*;
import javax.swing.*;
public class BallGame extends JFrame {
	//�̳д�����
	//���ڼ���
	Image ball=Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk=Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	double x=100;
	double y=100;
	double degree=3.14/3;//����60���޸��ļ�
	public void paint(Graphics g) {
		System.out.println("chuangkouhuayici");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
		
		
		x = x+10*Math.cos(degree);
		y = y+10*Math.sin(degree);
		
		if(y>500-40-30||y<80) {
			degree = -degree;
		}
		if(x<40||x>856-40-30) {
			degree = 3.14 - degree;
			
		}

	}
	
	//���ڼ���
	void launchFrame() {
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
	//�����ػ� ÿ�뻰25
		while(true) {
			repaint();
			try {
				Thread.sleep(40);
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		}
		
	}
	public static void main(String[] args) {
		BallGame game = new BallGame();
		game.launchFrame();
	}
	
}
