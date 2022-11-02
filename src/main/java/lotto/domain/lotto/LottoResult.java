package lotto.domain.lotto;

import java.util.Objects;

import lotto.domain.amount.Amount;
import lotto.domain.amount.MatchRank;
import lotto.domain.match.count.MatchCount;

public class LottoResult {
	private final Lotto lotto;
	private final MatchCount matchCount;

	private LottoResult(Lotto lotto, MatchCount matchCount) {
		this.lotto = lotto;
		this.matchCount = matchCount;
	}

	public static LottoResult from(Lotto lotto, MatchCount matchCount) {
		return new LottoResult(lotto, matchCount);
	}

	public boolean hasMatchCount(MatchCount matchCount) {
		return this.matchCount.equals(matchCount);
	}

	public Amount winningPrice() {
		return Amount.from(MatchRank.valueOfMatchCount(matchCount.getInt()).getWinningPrice());
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		LottoResult that = (LottoResult)o;
		return Objects.equals(lotto, that.lotto) && Objects.equals(matchCount, that.matchCount);
	}

	@Override
	public int hashCode() {
		return Objects.hash(lotto, matchCount);
	}
}
