package com.cofoge.training.mokitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;

import org.junit.runner.RunWith;

//Mockito needs to be initialized, to mock and inject objects marked by Annotations.
@RunWith(MockitoJUnitRunner.class)
public class RecordServiceTest {

@InjectMocks
RecordService recordService;

@Mock
DatabaseDAO databaseMock;

@Mock
NetworkDAO networkMock;


@Test
public void SaveTest()
{
boolean saved= recordService.save("hello.txt");
assertEquals(true, saved);


//verify that method in the mock object have been involved
verify(databaseMock,times(1)).save("hello.txt");
verify(networkMock,times(1)).save("hello.txt");


}
}