package jp.personal.iroha.tool.common;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 共通設定ファイルクラス
 * @author iroha
 *
 */
public class MySetting {
	protected File profile;
	protected ArrayList<File> inFileList;

	/**
	 * init class fields
	 * @param settingFile
	 */
	public MySetting(File settingFile) {
		this.profile = settingFile;
		this.inFileList = new ArrayList<File>();
	}
	/**
	 * 設定読み込み
	 * @throws IOException
	 */
	protected void readProfile() throws IOException {
		FileReader br = null;
		try {
			br = new FileReader(this.profile);
			this.readFile();
		} finally {
			br.close();
		}
	}
	/**
	 *
	 */
	protected void readFile() {

	}
}
