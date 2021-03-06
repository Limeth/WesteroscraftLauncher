/*
 * This file is part of Westeroscraft Launcher.
 *
 * Copyright (c) 2011 Spout LLC <http://www.spout.org/>
 * Westeroscraft Launcher is licensed under the Spout License Version 1.
 *
 * Westeroscraft Launcher is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the Spout License Version 1.
 *
 * Westeroscraft Launcher is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the Spout License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://spout.in/licensev1> for the full license,
 * including the MIT license.
 */
/*
 * This file is part of Spoutcraft Launcher.
 *
 * Copyright (c) 2011 Spout LLC <http://www.spout.org/>
 * Spoutcraft Launcher is licensed under the Spout License Version 1.
 *
 * Spoutcraft Launcher is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the Spout License Version 1.
 *
 * Spoutcraft Launcher is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the Spout License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://spout.in/licensev1> for the full license,
 * including the MIT license.
 */
package org.spoutcraft.launcher;

public final class Memory {
	public static final Memory[] memoryOptions = {
		(new Memory(512, "512 MB", 1)),
		(new Memory(768, "768 MB", 2)),
		(new Memory(1024, "1 GB", 0)),
		(new Memory(1536, "1.5 GB", 3)),
		(new Memory(2048, "2 GB", 4)),
		(new Memory(3072, "3 GB", 5)),
		(new Memory(4096, "4 GB", 6)),
		(new Memory(5120, "5 GB", 7)),
		(new Memory(6144, "6 GB", 8)),
		(new Memory(7168, "7 GB", 9)),
		(new Memory(8192, "8 GB", 10)),
		(new Memory(9216, "9 GB", 11)),
		(new Memory(10240, "10 GB", 12)),
		(new Memory(11264, "11 GB", 13)),
		(new Memory(12288, "12 GB", 14)),
		(new Memory(13312, "13 GB", 15)),
		(new Memory(14336, "14 GB", 16)),
		(new Memory(15360, "15 GB", 17)),
		(new Memory(16384, "16 GB", 18)),
	};
	public static final Memory DEFAULT_MEM = memoryOptions[2];
	public static final int MAX_32_BIT_MEMORY = 1024;

	int memory;
	String text;
	int option;
	private Memory(int memory, String text, int option) {
		this.memory = memory;
		this.text = text;
		this.option = option;
	}

	public int getMemoryMB() {
		return memory;
	}

	public String getDescription() {
		return text;
	}

	public int getSettingsId() {
		return option;
	}

	public static Memory getMemoryFromId(int id) {
		for (Memory m : memoryOptions) {
			if (m.getSettingsId() == id) {
				return m;
			}
		}
		return DEFAULT_MEM;
	}

	public static int getMemoryIndexFromId(int id) {
		for (int i = 0; i < memoryOptions.length; i++) {
			if (memoryOptions[i].option == id) {
				return i;
			}
		}
		return id;
	}
}
