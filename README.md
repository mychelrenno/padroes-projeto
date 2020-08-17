# padroes-projeto
<br>
	<h1>Design Patterns by GoF</h1>
<br>
<h1 style="border-top: 5px solid red;">Creational</h1>
<p>- Eles disponibilizam uma maneira para criar objetos ocultando os detalhes da sua cria��o, ao inv�s de utilizar o operador new diretamente. Isto d� mais flexibilidade na hora de decidir quais objetos precisam ser criados para um determinado caso</p>
<dl>
  <dt>Singleton</dt>
  <dd>- Inten��o: garantir que uma determinada classe tenha uma, e somente uma inst�ncia, mantendo um ponto global de acesso para a mesma</dd>
  
  <dt>Factory Method</dt>
  <dd>- Inten��o: definir uma interface para criar um objeto, mas deixar as subclasses decidirem que classe instanciar.</dd>
  <dd>- Cria uma inst�ncia de v�rias classes derivadas</dd>
  
  <dt>Abstract Factory</dt>
  <dd>- Inten��o: fornecer uma interface para cria��o de fam�lias de objetos relacionados ou dependentes sem especificar suas classes concretas</dd>
  <dd>- Cria uma inst�ncia de v�rias fam�lias de classes</dd>
  
  <dt>Builder</dt>
  <dd>- Inten��o: separar a constru��o de um objeto complexo da sua representa��o de modo que o mesmo processo de constru��o possa criar diferentes representa��es.</dd>
  <dd>- Separa a constru��o do objeto de sua representa��o</dd>
  
  <dt>Prototype</dt>
  <dd>- Inten��o: especificar os tipos de objetos a serem criados usando uma inst�ncia prot�tipo e criar novos objetos pela c�pia deste prot�tipo</dd>
  <dd>- Uma inst�ncia inicializada a ser copiada ou clonada</dd>
</dl>

<h1 style="border-top: 5px solid red;">Structural</h1>
<p>- Eles se preocupam com a composi��o das classes e seus objetos. O conceito de heran�a � largamente utilizado para compor interfaces e definir maneiras para compor objetos e obter novas funcionalidades.</p>
<dl>
  <dt>Bridge</dt>
  <dd>- Inten��o: desacoplar uma abstra��o da sua implementa��o, de modo que as duas possam variar independentemente</dd>
  <dd>- Separa a interface do objeto de sua implementa��o</dd>
  
  <dt>Adapter</dt>
  <dd>- Inten��o: converter a interface de uma classe em outra interface, esperada pelos clientes. O adapter permite que classes com interfaces incompat�veis trabalhem em conjunto o que, de outra forma, seria imposs�vel.</dd>
  <dd>- Equiparar interfaces de diferentes classes</dd>
  
  <dt>Proxy</dt>
  <dd>- Inten��o: fornece um substituto (surrogate) ou marcador da localiza��o de outro objeto para controlar o acesso ao mesmo.</dd>
  <dd>- Um objeto representando um outro objeto</dd>
  
  <dt>Decorator</dt>
  <dd>- Inten��o: agregar dinamicamente responsabilidades adicionais a um objeto</dd>
  <dd>- Permite adicionar um comportamento ao um objeto j� existente em tempo de execu��o</dd>
  
  <dt>Composite</dt>
  <dd>- Inten��o: compor objetos em estruturas de �rvore para representarem hierarquias todo-parte</dd>
  
  <dt>Facade</dt>
  <dd>- Inten��o: fornecer uma interface unificada para um conjunto de interfaces em um subsistema. Facade define uma interface de n�vel mais alto que torna o subsistema mais f�cil de ser usado</dd>
  <dd>- Uma �nica classe representa um subsistema inteiro</dd>
  
  <dt>Flyweight</dt>
  <dd>- Inten��o: usar compartilhamento para suportar eficientemente grandes quantidades de objetos de granularidade fina</dd>
</dl>

<h1 style="border-top: 5px solid red;">Behavioral(Comportamental)</h1>
<dl>
  <dt>Command</dt>
  <dd>- </dd>
  
  <dt>Strategy</dt>
  <dd>- </dd>
  
  <dt>State</dt>
  <dd>- </dd>
  
  <dt>Observer</dt>
  <dd>- </dd>
  
  <dt>Mediator</dt>
  <dd>- </dd>
  
  <dt>Chain of Responsability</dt>
  <dd>- </dd>
  
  <dt>Template Method</dt>
  <dd>- </dd>
  
  <dt>Interpreter</dt>
  <dd>- </dd>
  
  <dt>Memento</dt>
  <dd>- </dd>
  
  <dt>Iterator</dt>
  <dd>- </dd>
  
  <dt>Visitor</dt>
  <dd>- </dd>
</dl>