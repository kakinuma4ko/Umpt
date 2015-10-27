package com.applock.umpt;

import java.text.DecimalFormat;

/**
 * �ı�ת��
 * @author Administrator
 *
 */
public class TextFormater {
	/**
	 * ����byte�����ݴ�С��Ӧ���ı�
	 * @param siz
	 * @return
	 */
	public static String getDataSize(long size){
		DecimalFormat formater = new DecimalFormat("####.00");
		if(size<1024){
			return size+"bytes";
		}else if(size<1024*1024){
			float kbsize=size/1024f;
			return formater.format(kbsize)+"KB";
		}else if(size<1024*1024*1024){
			float mbsize=size/1024f/1024f;
			return formater.format(mbsize)+"MB";
		}else{
			return "size: error";
		}
	}
	/**
	 * ����kb�����ݴ�С��Ӧ���ı�
	 * @param siz
	 * @return
	 */
	public static String getKBDataSize(long size){
		return getDataSize(size*1024);
	}
}