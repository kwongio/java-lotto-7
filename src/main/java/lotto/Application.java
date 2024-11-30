package lotto;

import lotto.controller.LottoController;
import lotto.controller.LottoControllerFactory;

public class Application {
    public static void main(String[] args) {
        LottoController lottoController = LottoControllerFactory.create();
        lottoController.run();
    }
}
