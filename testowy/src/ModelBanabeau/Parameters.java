package ModelBanabeau;

public class Parameters {
	double ro;
	int matrixSize;
	int winPoint;
	int lostPoint;
	int miu;
	int eta;
	
	public Parameters() {
		ro = 0.5;
		matrixSize = 2;
		winPoint = 1;
		lostPoint = 1;
		miu = 1;
		eta = 1;
	}
	public double getRo() {
		return ro;
	}
	public void setRo(int ro) {
		this.ro = ro;
	}
	public int getMatrixSize() {
		return matrixSize;
	}
	public void setMatrixSize(int matrixSize) {
		this.matrixSize = matrixSize;
	}
	public int getWinPoint() {
		return winPoint;
	}
	public void setWinPoint(int winPoint) {
		this.winPoint = winPoint;
	}
	public int getLostPoint() {
		return lostPoint;
	}
	public void setLostPoint(int lostPoint) {
		this.lostPoint = lostPoint;
	}
	public int getMiu() {
		return miu;
	}
	public void setMiu(int miu) {
		this.miu = miu;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	

}
