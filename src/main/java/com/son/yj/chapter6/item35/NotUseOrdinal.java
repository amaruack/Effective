package com.son.yj.chapter6.item35;

public class NotUseOrdinal {

    /**
     * ordinal 메소드는 왠만하면 사용하지 말자
     * ordinal 메소드는 = 상수가 해당 열거 타입에서 몇 번째 위치인지를 반화하는 메소드
     *
     * "대부분 프로그래머는 이 메서드를 쓸 일이 없다. 이 메서드는 EnumSet과 EnumMap 같이 열거 타입 기반의 범용 자료구조에 쓸 목적으로 설계되었다. "
     */
    enum Ensemble_NOTUSE {
        SOLE, DUET;

        public int numberOfMusicians() {
            return ordinal() + 1;
        }
    }

    // 다음과 같이 인스턴스 필드 지정
    enum Ensemble {
        SOLE(1), DUET(2);

        private int musicians;
        Ensemble(int musicians) {
            this.musicians = musicians;
        }

        public int numberOfMusications() {
            return musicians;
        }
    }

}
