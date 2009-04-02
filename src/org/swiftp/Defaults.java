/*
Copyright 2009 David Revell

This file is part of SwiFTP.

SwiFTP is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

SwiFTP is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with SwiFTP.  If not, see <http://www.gnu.org/licenses/>.
*/

package org.swiftp;

import android.content.Context;
import android.util.Log;

public class Defaults {
	protected static int inputBufferSize = 256;
	protected static boolean allowOverwrite = false;
	protected static int dataChunkSize = 8192;  // do file I/O in 8k chunks 
	protected static int sessionMonitorScrollBack = 10;
	protected static int serverLogScrollBack = 10;
	protected static int uiLogLevel = Defaults.release ? Log.INFO : Log.DEBUG;
	protected static int consoleLogLevel = Defaults.release ? Log.INFO : Log.DEBUG;
	protected static String settingsName = "SwiFTP";
	//protected static String username = "user";
	//protected static String password = "";
	protected static int portNumber = 2121; 
	
	public static final boolean release = true;
	
	public static int getPortNumber() {
		return portNumber;
	}

	public static void setPortNumber(int portNumber) {
		Defaults.portNumber = portNumber;
	}

	public static String getSettingsName() {
		return settingsName;
	}

	public static void setSettingsName(String settingsName) {
		Defaults.settingsName = settingsName;
	}

	public static int getSettingsMode() {
		return settingsMode;
	}

	public static void setSettingsMode(int settingsMode) {
		Defaults.settingsMode = settingsMode;
	}

	public static void setServerLogScrollBack(int serverLogScrollBack) {
		Defaults.serverLogScrollBack = serverLogScrollBack;
	}

	protected static int settingsMode = Context.MODE_WORLD_WRITEABLE;
	
	public static int getUiLogLevel() {
		return uiLogLevel;
	}

	public static void setUiLogLevel(int uiLogLevel) {
		Defaults.uiLogLevel = uiLogLevel;
	}

	public static int getInputBufferSize() {
		return inputBufferSize;
	}

	public static void setInputBufferSize(int inputBufferSize) {
		Defaults.inputBufferSize = inputBufferSize;
	}

	public static boolean isAllowOverwrite() {
		return allowOverwrite;
	}

	public static void setAllowOverwrite(boolean allowOverwrite) {
		Defaults.allowOverwrite = allowOverwrite;
	}

	public static int getDataChunkSize() {
		return dataChunkSize;
	}

	public static void setDataChunkSize(int dataChunkSize) {
		Defaults.dataChunkSize = dataChunkSize;
	}

	public static int getSessionMonitorScrollBack() {
		return sessionMonitorScrollBack;
	}

	public static void setSessionMonitorScrollBack(
			int sessionMonitorScrollBack) 
	{
		Defaults.sessionMonitorScrollBack = sessionMonitorScrollBack;
	}

	public static int getServerLogScrollBack() {
		return serverLogScrollBack;
	}

	public static void setLogScrollBack(int serverLogScrollBack) {
		Defaults.serverLogScrollBack = serverLogScrollBack;
	}

	public static int getConsoleLogLevel() {
		return consoleLogLevel;
	}

	public static void setConsoleLogLevel(int consoleLogLevel) {
		Defaults.consoleLogLevel = consoleLogLevel;
	}


}
