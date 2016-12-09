package list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * �������50��С��100������,������ز���
 *
 */
public class ListDemo {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		Map<Integer,ArrayList<Integer>> map=new HashMap<Integer,ArrayList<Integer>>();
		for(int i=0;i<50;i++){
			list.add((int)(Math.random()*100));
		}
		for(Integer integer :list){
			int x =integer.intValue();
			if (map.containsKey(x)) {
				map.get(x).add(integer);
			}else {
				ArrayList<Integer> set=new ArrayList<Integer>();
				set.add(integer);
				map.put(x, set);
			}
		}
		System.out.print("�������50��С��100����,�ֱ�Ϊ: ");
		for(Integer integer :list){
			if (list.indexOf(integer)==(list.size()-1)) {
				System.out.print(integer+"\n");
			}else{
				System.out.print(integer+"\n");
			}
		}
		System.out.println("Map�е�����Ϊ  "+map);
		Set<Integer> set=map.keySet();
		Map<Integer, TreeSet<Integer>> map2=new HashMap<Integer,TreeSet<Integer>>();
		for(Integer integer:set){
			TreeSet<Integer> set2=new TreeSet<Integer>();
			Iterator<Integer> iterator=map.get(integer).iterator();
			while(iterator.hasNext()){
				set2.add(iterator.next());
			}
			map2.put(integer, set2);
		}
		System.out.println("������MapΪ:"+map2);
	}
}
