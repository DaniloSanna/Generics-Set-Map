package entities;

import java.time.Instant;
import java.util.Date;

public class Users_Exemplo541 {
	private String name;
	private Date data;
	
	public Users_Exemplo541(String name, String data) {
		
		
		this.name = name;
		this.data = Date.from(Instant.parse(data));;
	}

	public String getName() {
		return name;
	}

	public Date getData() {
		return data;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users_Exemplo541 other = (Users_Exemplo541) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	

	
}
