package pairs;

public class Pairs {
	private ListCollection<Integer, Integer> list = new ListCollection<Integer, Integer>();
	private ListCollection<Integer, Integer> result = new ListCollection<Integer, Integer>();
	public Pairs(){
		list.Add(1, 4);
		list.Add(2, 5);
		list.Add(7, 3);
		list.Add(4, 6);
		list.Add(7, 7);
	}
	public void FindFirstUpSecondDown()
	{
		for(int i = 0; i < list.Size(); i++)
		{
			if(list.getFirst(i) < list.getSecond(i) &&
			   list.getFirst(i + 1) > list.getSecond(i + 1))
			{
				if(result.Size() == 0)
				{
					result.Add(list.getFirst(i), list.getSecond(i));
					result.Add(list.getFirst(i + 1), list.getSecond(i + 1));
				}
				else
				{
					ListCollection<Integer, Integer> tmp = new ListCollection<Integer, Integer>();
					tmp.Add(list.getFirst(i), list.getSecond(i));
					tmp.Add(list.getFirst(i + 1), list.getSecond(i + 1));
					if(tmp.LengthPairs() >= result.LengthPairs())
					{
						result.DeleteAll();
						result.Add(list.getFirst(i), list.getSecond(i));
						result.Add(list.getFirst(i + 1), list.getSecond(i + 1));
					}
				}
			}
		}
		System.out.println("RESULT = ");
		result.Print();
	}
	
}
