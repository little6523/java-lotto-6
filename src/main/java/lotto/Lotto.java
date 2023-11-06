package lotto;

import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        isOneToFourtyfive(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    // TODO: 추가 기능 구현
    public void printLottoNumbers() {
        System.out.println(this.numbers);
    }

    private void isOneToFourtyfive(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) < 1 || numbers.get(i) > 45) {
                throw new IllegalArgumentException();
            }
        }
    }
}
