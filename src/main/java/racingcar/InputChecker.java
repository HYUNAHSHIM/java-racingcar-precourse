package racingcar;

public class InputChecker {

    /**
     * 차 이름들의 유효성을 체크해주는 메서드
     * @param carName
     */
    public static void checkCarName(String[] carName) {
        if (carName.length == 0) {
            throw new IllegalArgumentException("[ERROR] 1개 이상의 차 이름을 입력하세요");
        }

        for (int i = 0; i < carName.length; i++) {
            if (carName[i].length() > 5) {
                throw new IllegalArgumentException("[ERROR] 5자 이하의 이름을 입력하세요.");
            }
            if (carName[i].isEmpty()) {
                throw new IllegalArgumentException("[ERROR] 1자 이상의 이름을 입력하세요.");
            }
        }
    }
}
