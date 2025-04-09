class Wire{
	static void connect(){
		System.out.println("Connecting wires");
	}
	static void disconnect(){
		System.out.println("Disconnecting wires");
		connect();
	}
	static void transmit(){
		Perfume.spray();
	}
	static void insulate(){
		TrafficSignal.red();
	}
}