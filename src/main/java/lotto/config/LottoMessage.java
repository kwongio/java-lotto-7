package lotto.config;

public enum LottoMessage {

    INPUT_MONEY("구입금액을 입력해 주세요."),
    ;

    private final String message;


    LottoMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}