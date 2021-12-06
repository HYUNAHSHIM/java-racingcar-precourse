package racingcar;

import java.util.ArrayList;

public class Game {

    /**
     * 우승자들을 결정하는 메서드
     * @param cars
     * @return ArrayList<Car>
     */
    public static ArrayList<Car> determineWinner(ArrayList<Car> cars) {
        ArrayList<Car> winners = new ArrayList<>();
        int max = -1;
        for (int i = 0; i < cars.size(); i++) {
            int position = cars.get(i).getPosition();
            if (position > max) {
                max = position;
                winners.clear();
                winners.add(cars.get(i));
            }
            if (cars.get(i).getPosition() == max) {
                winners.add(cars.get(i));
            }
        }
        return winners;
    }

    /**
     * 랜덤한 숫자가 4이상이면 차 이동시키는 메서드
     * @param car
     * @return Car
     */
    public static Car moveCar(Car car) {
        int selected = camp.nextstep.edu.missionutils.Randoms.pickNumberInRange(0, 9);
        if (selected > 4) {
            car.move();
        }
        return car;
    }

    /**
     * n번의 이동을 하는 게임을 시작하는 메서드
     * @param cars
     * @param num
     * @return ArrayList<Car>
     */
    public static ArrayList<Car> startGame(ArrayList<Car> cars, int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < cars.size(); j++) {
                cars.set(j, moveCar(cars.get(j)));
            }
        }
        return cars;
    }
}
