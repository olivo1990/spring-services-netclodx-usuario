package com.springboot.netclodx.auth;

public class JwtConfig {
	
	private String claveSecreta = null;
	
	public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\n" + 
			"MIIBOwIBAAJBANR4oM8js7OZBsHkx0TCMw8rrOTdty+f1k7areaFNUkCBK2kQLEk\n" + 
			"MBzHZIdmAr9enwpAqUrSQObfsZxRJR47makCAwEAAQJANVZi6B0KS5eqvpnz/CrU\n" + 
			"LobETF/sUKRLZFg5N5lRGxZVdgSGj8ahVbWhVp40oYWc0G5y+YRDS/njMQ3cofsg\n" + 
			"EQIhAPD0sMuWAETKzKPt3kBl6bGCxVV+k4h5BgF7HrNvZu6DAiEA4bynk2m7paqg\n" + 
			"tBXVgr4g/V5518AullEjdRQsEbVun2MCIQCj48rcropAQDAwz/n7k1YAhxHxtMZk\n" + 
			"bOzI1RVstrksQQIgOGmnD0XrKRmdE6QpOYU+RVNo66wReGtKiyXBZaOLw7UCIQCb\n" + 
			"FhApsevImpMOzQjavJoTuzev6RH2TXQgv0OwaCvVdQ==\n" + 
			"-----END RSA PRIVATE KEY-----"; 
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\n" + 
			"MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBANR4oM8js7OZBsHkx0TCMw8rrOTdty+f\n" + 
			"1k7areaFNUkCBK2kQLEkMBzHZIdmAr9enwpAqUrSQObfsZxRJR47makCAwEAAQ==\n" + 
			"-----END PUBLIC KEY-----";

	public String getClaveSecreta() {
		return claveSecreta;
	}

	public void setClaveSecreta(String claveSecreta) {
		this.claveSecreta = claveSecreta;
	} 
	
	
}
