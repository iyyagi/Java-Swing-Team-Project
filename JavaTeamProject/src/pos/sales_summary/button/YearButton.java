package pos.sales_summary.button;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import pos.sales_summary.main.SalesYearCheckMain;
import pos.util.ImageScaledTool;

public class YearButton extends JButton implements ActionListener{
	
	ImageScaledTool tool = new ImageScaledTool();
	

	public YearButton() {
	
		setIcon(new ImageIcon(tool.getScaledImage(
				"images/PosImages/매출 요약 이미지/연 매출.png", 300, 300)));
		setPressedIcon(new ImageIcon(tool.getScaledImage(
				"images/PosImages/매출 요약 이미지/연 매출 클릭.png", 300, 300)));
		addActionListener(this);
		setBounds(825, 265, 300, 300); // 위치 및 사이즈 조절
		setContentAreaFilled(false);
		setBorderPainted(false); 
		setOpaque(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new SalesYearCheckMain();
	}
}
