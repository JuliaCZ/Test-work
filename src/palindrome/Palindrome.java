package palindrome;

public class Palindrome {
	private int result = 0;
	public Palindrome()
	{
		
	}
	public void find()
	{
		int test_number = 0;//����� ������� ����� ���������
		String tmp = String.valueOf(test_number);
		char[] number = tmp.toCharArray();
		boolean flag = false;
		for(int i = 0; i < 1000000; i++)//���� �� ���� ������
		{
			for(int number_i = 0; number_i < number.length / 2; number_i++)//���� �� �������� �����
			{
				//����� ������ ������ � �������� � ���������
				//������ � ������������� � �.�
				if(number[number_i] == number[number.length - 1 - number_i])
				{
					flag = true;
				}
				else
				{
					flag = false;
					break;
				}			
			}
			if(flag){result = test_number;}
			test_number++;
			tmp = String.valueOf(test_number);
			number = tmp.toCharArray();
		}
		System.out.println("Largest palindrome formed by the product of two three-digit numbers = " + this.result);
	}
}
