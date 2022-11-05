package lotto.domain.amount;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmountTest {
	@Test
	void 객체_생성() {
		assertThat(Amount.from(5000L)).isEqualTo(Amount.from(5000L));
	}

	@Test
	void 금액_더하기() {
		assertThat(Amount.from(5000).sum(Amount.from(10000))).isEqualTo(Amount.from(15000));
	}

	@Test
	void 금액_빼기() {
		assertThat(Amount.from(5000).sub(Amount.from(2000))).isEqualTo(Amount.from(3000));
	}

	@Test
	void 금액_비교() {
		assertThat(Amount.from(5000).greaterThanEqual(Amount.from(2000))).isTrue();
		assertThat(Amount.from(2000).greaterThanEqual(Amount.from(5000))).isFalse();
	}
}
