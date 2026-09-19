
	package busResv;

	public class Bus{
		private int busNo;
		private boolean ac;
		private int capacity;
		
		Bus(int no,boolean ac,int cap){
			this.busNo=no;
			this.ac=ac;
			this.capacity=cap;
			
		}
		public int getCapacity(){
			return capacity;
		}
		public void setCapacity(int cap) {
			capacity=cap;
		}
		public boolean getac() {
			return ac;
		}
		public void Setac(boolean val) {
			ac=val;
		}
		public int getbusNo() {
			return busNo;
		}
		public void setbusNo(int no) {
			busNo=no;
		}
		public void displayBusInfo() {
			System.out.println("Bus No:"+busNo);
			System.out.println("Ac:"+ac);
			System.out.println("Capacity:"+capacity);;

		}
	}
