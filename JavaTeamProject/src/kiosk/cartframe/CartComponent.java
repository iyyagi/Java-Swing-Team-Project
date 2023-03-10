package kiosk.cartframe;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import kiosk.tools.WithImage;

public class CartComponent {
	
	String root = "images/KioskImages/7. 주문정보 확인";
	WithImage wi = new WithImage(root);
	
	//로고
	public JLabel logo() {
		JLabel logo = new JLabel();
			
		logo.setBounds(52, 25, 60, 83);
		
		
		try {
			BufferedImage logoBufferedImage =
			ImageIO.read(new File("images/KioskImages/3_메뉴선택/logoScaled.png"));			
			logo.setIcon(new ImageIcon(logoBufferedImage));
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
		return logo;
	}
		
	//홈버튼
	public JButton homeButton() {
		JButton homeButton = new JButton();
		
		homeButton.setContentAreaFilled(false);
		homeButton.setFocusable(false);
		homeButton.setBorderPainted(false);	
		homeButton.setBackground(Color.white); // Opaque 사용위해서 아무색이나 지정
		homeButton.setOpaque(false);

		homeButton.setBounds(542, 44, 52, 52);
		
		try {
			BufferedImage homeBufferedImage =
			ImageIO.read(new File("images/KioskImages/3_메뉴선택/homeScaled.png"));
			homeButton.setIcon(new ImageIcon(homeBufferedImage));
			
			BufferedImage homePressedBufferedImage =
					ImageIO.read(new File("images/KioskImages/3_메뉴선택/homePressedScaled.png"));
					homeButton.setPressedIcon(new ImageIcon(homePressedBufferedImage));
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return homeButton;
	}	
		
	//메인라벨 ("주문 정보를 확인해주세요.")
	//가격라벨
	public JLabel priceLabel() {
		JLabel label = new JLabel();
		Font font = new Font("맑은 고딕", Font.BOLD, 15);
		label.setFont(font);
		
		label.setText("주문 금액");
		label.setBounds(350, 645, 91, 23);
		
		
		return label;
	}
	
	//가격
	public JLabel price() {
		JLabel label = new JLabel();
		Font font = new Font("맑은 고딕", Font.BOLD, 15);
		label.setFont(font);
		
		label.setText("11,200원");
		label.setBounds(480, 645, 91, 23);
		label.setHorizontalAlignment(JLabel.RIGHT);
		
		return label;
	}
	
	
	public JLabel pointLabel() {
		JLabel label = new JLabel();
		Font font = new Font("맑은 고딕", Font.BOLD, 16);
		label.setFont(font);
		
		label.setText("포인트 사용");
		label.setBounds(332, 680, 112, 23);

		
		return label;
	}
	
	public JLabel point() {
		JLabel label = new JLabel();
		Font font = new Font("맑은 고딕", Font.BOLD, 16);
		label.setFont(font);
		
		label.setText("200원");
		label.setBounds(460, 680, 112, 23);
		label.setHorizontalAlignment(JLabel.RIGHT);
		
		return label;
	}
	
	
	public JLabel totalPriceLabel() {
		JLabel label = new JLabel();
		Font font = new Font("맑은 고딕", Font.BOLD, 27);
		label.setFont(font);
		
		label.setText("결제 금액");
		label.setBounds(300, 715, 126, 32);

		
		return label;
	}
	
	public JLabel totalPrice() {
		JLabel label = new JLabel();
		Font font = new Font("맑은 고딕", Font.BOLD, 27);
		label.setForeground(Color.getHSBColor(63, 186, 145));
		label.setFont(font);
		label.setText("11,000원");
		label.setBounds(450, 715, 126, 32);
		label.setHorizontalAlignment(JLabel.RIGHT);
		
		return label;
	}
}
