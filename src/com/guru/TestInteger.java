package com.guru;

import javax.xml.datatype.DatatypeConstants;


public class TestInteger {

	public static void main(String[] args) {
	System.out.println("Integer.MAX_VALUE " + Integer.MAX_VALUE);
	System.out.println("Integer.MIN_VALUE " + Integer.MIN_VALUE);
	Double dval = null;
//	DataType = da
//	if(DataType.SHORT == )
	}
	
	public enum DataType {
		UNDEFINED((short) 0), STRING((short) 1), SHORT((short) 3), LONG((short) 4), DECIMAL((short) 6), DATE((short) 7), TIME((short) 8), TIMESTAMP((short) 9), DOUBLE((short) 10), BOOL((short) 20), UUID((short) 21);

		private short type;

		private DataType(short type) {
			this.type = type;
		}

		public short getType() {
			return type;
		}

		public static DataType getEnum(short type) {
			for (DataType dt : values()) {
				if (dt.getType() == type) {
					return dt;
				}
			}

			// We no longer throw this exception because then new data types in newer IDM versions will break old ICP versions
			// throw new IllegalArgumentException("Invalid DataType value: " + type);
			return UNDEFINED;
		}
	}

}
