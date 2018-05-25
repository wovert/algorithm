import java.awt.EventQueue;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		// 事件线程
		EventQueue.invokeLater(()->{
			//AlgoFrame frame = new AlgoFrame("Welcome", 500, 500); // 创建窗口
			AlgoFrame frame = new AlgoFrame("Hello");
		});
	
	}

}
