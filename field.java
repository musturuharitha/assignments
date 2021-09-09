package assignment2;

import java.beans.Encoder;
import java.beans.Expression;
import java.beans.PersistenceDelegate;

public class field extends PersistenceDelegate{
	int num; String type;

	public field(int num, String type) {
		this.num=num;
		this.type=type;
	}

	void persist()

	@Override
	protected Expression instantiate(Object oldInstance, Encoder out) {
		
		return null;
	}
	}
	