package day02;

import java.util.Scanner;

public class CalTotalAvg {
        public static void main(String[] args) {
            // 创建Scanner对象用于接收输入
            Scanner scanner = new Scanner(System.in);

            // 提示并获取3位裁判的打分
            System.out.println("请输入3位裁判的打分（满分10分）：");

            System.out.print("第一位裁判打分：");
            double score1 = scanner.nextDouble();

            System.out.print("第二位裁判打分：");
            double score2 = scanner.nextDouble();

            System.out.print("第三位裁判打分：");
            double score3 = scanner.nextDouble();

            // 计算平均分
            double average = (score1 + score2 + score3) / 3;

            // 输出结果，保留两位小数
            System.out.printf("3位裁判的平均分为：%.2f\n", average);

            // 关闭Scanner
            scanner.close();
        }
}