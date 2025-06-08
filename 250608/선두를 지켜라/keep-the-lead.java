import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // A 이동 정보 개수
        int M = sc.nextInt();  // B 이동 정보 개수

        List<Integer> aTimeline = new ArrayList<>();
        List<Integer> bTimeline = new ArrayList<>();

        // A의 이동 구간 펼치기
        for (int i = 0; i < N; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                aTimeline.add(v);
            }
        }

        // B의 이동 구간 펼치기
        for (int i = 0; i < M; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                bTimeline.add(v);
            }
        }

        int aPos = 0;
        int bPos = 0;
        Integer prevLeader = null; // null로 시작 (초기에는 선두 없음)
        int leadChangeCount = 0;

        for (int i = 0; i < aTimeline.size(); i++) {
            aPos += aTimeline.get(i);
            bPos += bTimeline.get(i);

            int currentLeader;
            if (aPos > bPos) {
                currentLeader = 1;
            } else if (aPos < bPos) {
                currentLeader = -1;
            } else {
                currentLeader = 0;  // 같으면 선두 없음
            }

            if (currentLeader != 0) {
                if (prevLeader == null) {
                    // 처음 선두가 정해짐 (선두 바뀐 게 아님)
                    prevLeader = currentLeader;
                } else if (currentLeader != prevLeader) {
                    leadChangeCount++;
                    prevLeader = currentLeader;
                }
            }
            // currentLeader == 0이면 아무것도 하지 않음 (선두 없음 상태 유지)
        }

        System.out.println(leadChangeCount);
    }
}
