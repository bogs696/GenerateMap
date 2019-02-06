import java.util.Random;

public class GenerateMap {
	private final int SIZE_ROOM = 13;
	private final int SIZE_MAP = 30;
private String greatMap ="☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼"+
						 "☼             ☼☼             ☼"+
						 "☼             ☼☼             ☼"+
						 "☼             ☼#             ☼"+
						 "☼             ☼☼             ☼"+
						 "☼             ☼☼             ☼"+
						 "☼             ☼☼             ☼"+
						 "☼                            ☼"+
						 "☼             ☼☼             ☼"+
						 "☼             ☼☼             ☼"+
						 "☼             ☼☼             ☼"+
						 "☼             ☼#             ☼"+
						 "☼             ☼☼             ☼"+
						 "☼             ☼☼             ☼"+
						 "☼☼☼☼☼☼☼ ☼☼☼☼☼☼☼☼☼☼☼☼☼☼ ☼☼☼☼☼☼☼"+
						 "☼☼☼☼☼☼☼ ☼☼☼☼☼☼☼☼☼☼☼☼☼☼ ☼☼☼☼☼☼☼"+
						 "☼             ☼☼             ☼"+
						 "☼             ☼☼             ☼"+
						 "☼             ☼#             ☼"+
						 "☼             ☼☼             ☼"+
						 "☼             ☼☼             ☼"+
						 "☼             ☼☼             ☼"+
						 "☼                            ☼"+
						 "☼             ☼☼             ☼"+
						 "☼             ☼☼             ☼"+
						 "☼             ☼☼             ☼"+
						 "☼             ☼#             ☼"+
						 "☼             ☼☼             ☼"+
						 "☼             ☼☼             ☼"+
						 "☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼";
private String[] room = {"             "+
						 "             "+
						 "             "+
						 "             "+
						 "    ☼☼ ☼☼    "+
						 "    ☼☼ ☼☼    "+
						 "             "+
						 "    ☼☼ ☼☼    "+
						 "    ☼☼ ☼☼    "+
						 "             "+
						 "             "+
						 "             "+
						 "             ",
						 
						 "☼☼☼☼☼☼ ☼☼☼☼☼☼"+
						 "☼   ☼   ☼   ☼"+
						 "  ☼   ☼   ☼ ☼"+
						 "☼   ☼   ☼   ☼"+
						 "☼☼ ☼☼☼ ☼☼☼ ☼☼"+
						 "☼   ☼   ☼   ☼"+
						 "  ☼   ☼   ☼  "+
						 "☼   ☼   ☼   ☼"+
						 "☼☼ ☼☼☼ ☼☼☼ ☼☼"+
						 "☼   ☼   ☼   ☼"+
						 "  ☼   ☼   ☼ ☼"+
						 "☼   ☼   ☼   ☼"+
						 "☼☼☼☼☼☼ ☼☼☼☼☼☼",

						 "     ☼ ☼     "+
						 " ☼☼☼ ☼ ☼ ☼☼☼ "+
						 "     ☼ ☼     "+
						 "☼☼☼       ☼☼☼"+
						 "             "+
						 "☼☼☼ ☼      ☼ "+
						 "    ☼ ☼☼☼  ☼ "+
						 "☼☼☼ ☼      ☼ "+
						 "             "+
						 "☼☼☼       ☼☼☼"+
						 "     ☼ ☼     "+
						 " ☼☼☼ ☼ ☼ ☼☼☼ "+
						 "     ☼ ☼     ",
						 
						 "        ☼☼☼  "+
						 "             "+
						 "  ☼☼☼        "+
						 "  ☼☼☼   ☼☼☼  "+
						 "  ☼☼☼   ☼☼☼  "+
						 "        ☼☼☼  "+
						 "             "+
						 "  ☼☼☼        "+
						 "  ☼☼☼   ☼☼☼  "+
						 "  ☼☼☼   ☼☼☼  "+
						 "        ☼☼☼  "+
						 "             "+
						 "  ☼☼☼        ",};
private StringBuilder value;
public GenerateMap() {
	value=new StringBuilder();
	uploade();
	
}
public String uploade() {
	Random random = new Random();
	int room1 = random.nextInt(room.length);
	int room2 = random.nextInt(room.length);
	int room3 = random.nextInt(room.length);
	int room4 = random.nextInt(room.length);
	value.append(greatMap);
	for(int xIndex = 0; xIndex<SIZE_ROOM;xIndex++) {
		for(int yIndex = 0; yIndex<SIZE_ROOM;yIndex++) {
			
			value.setCharAt(((xIndex+1)*SIZE_MAP)+(yIndex+1), room[room1].charAt(xIndex*SIZE_ROOM+yIndex));
			value.setCharAt(((xIndex+1)*SIZE_MAP)+(yIndex+16), room[room2].charAt(xIndex*SIZE_ROOM+yIndex));
			value.setCharAt(((xIndex+16)*SIZE_MAP)+(yIndex+1), room[room3].charAt(xIndex*SIZE_ROOM+yIndex));
			value.setCharAt(((xIndex+16)*SIZE_MAP)+(yIndex+16), room[room4].charAt(xIndex*SIZE_ROOM+yIndex));
		}
	}
	return value.toString();
}
public String getValue() {
	return value.toString();
}
public String toString() {
	return value.toString();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateMap map = new GenerateMap();
		String stringMap = map.getValue();
		for (int i = 0; i < stringMap.length(); i++) {
			if (i%30==0) {
				System.out.println();
			}
			System.out.print(stringMap.charAt(i));
			
		}
	}

}
