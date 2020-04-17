package B1946;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class NewWorker {

	public static void main(String[] args) {
		int T = 0, N = 0;
		Scanner si = new Scanner(System.in);
		
		T = si.nextInt();
		
		for(int t = 0; t < T; t++) {
			ArrayList<Ranking> ranks = new ArrayList<Ranking>();
			int count = 1;
			
			N = si.nextInt();
			for(int n = 0; n < N; n++) {
				int x1 = 0, y1 = 0;
				x1 = si.nextInt();
				y1 = si.nextInt();
				
				ranks.add(n, new Ranking(x1, y1));
			}
			//순위 낮은 순으로 정렬
			ranks.sort(new Comparator<Ranking>() {
				@Override
				public int compare(Ranking o1, Ranking o2) {
					return o1.x - o2.x;
				}
			});
			
			int tmp = ranks.get(0).y;
			//y순위 비교 위한 반복문
			for(int n2 = 1; n2 < N; n2++) {
				if(tmp > ranks.get(n2).y) {
					count++;
					tmp = ranks.get(n2).y;
				}
				
			}
			System.out.println(count);
		}
	}

}

class Ranking {
	int x, y;
	public Ranking(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
