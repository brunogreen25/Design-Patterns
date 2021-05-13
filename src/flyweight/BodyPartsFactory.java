package flyweight;

import java.util.*;

import singleton.NumberGenerator;

public class BodyPartsFactory {
	
	Map<String, BodyParts> cache;
	
	private BodyPartsFactory() {
		cache = new HashMap<>();
	}
	
	private static BodyPartsFactory bpf = null;
	
	public static BodyPartsFactory getInstance() {
		if (bpf == null) { 
			bpf = new BodyPartsFactory();
		}
		return bpf;
	}
	
	public BodyParts getBodyParts(String key, IntrinsicState intrinsicState) {
		if (cache.containsKey(key) == false) {
			cache.put(key, new BodyParts(intrinsicState));
		}
		return cache.get(key);
	}

}
