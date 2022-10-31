package lotto.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LottoResultMessageTest {
	@Test
	void 일치_횟수별_로또_결과_조회() {
		MatchCount matchcount = MatchCount.from(3);
		int quantity = 5;
		WinningPrice winningPrice = new WinningPrice(5000);
		LottoResultMessage lottoResultMessage = new LottoResultMessage(matchcount, quantity, winningPrice);
		assertThat(lottoResultMessage.toString())
			.isEqualTo(String.format("%d개 일치 (%d원)- %d", matchcount.getInt(), winningPrice.getLong(), quantity));
	}
}
