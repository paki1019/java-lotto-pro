package lotto.domain.lotto;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import lotto.domain.match.count.MatchCount;

class LottoResultTest {
	@Test
	void 객체_생성() {
		Lotto lotto = Lotto.from(Arrays.asList(1, 2, 3, 4, 5, 6));
		MatchCount matchCount = MatchCount.from(3);

		Assertions.assertThat(LottoResult.from(lotto, matchCount)).isEqualTo(LottoResult.from(lotto, matchCount));
	}

	@Test
	void 일치_갯수_체크() {
		Lotto lotto = Lotto.from(Arrays.asList(1, 2, 3, 4, 5, 6));
		MatchCount matchCount = MatchCount.from(3);

		LottoResult lottoResult = LottoResult.from(lotto, matchCount);

		assertThat(lottoResult.hasMatchCount(MatchCount.from(3))).isTrue();
		assertThat(lottoResult.hasMatchCount(MatchCount.from(4))).isFalse();
	}
}
