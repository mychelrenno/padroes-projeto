# padroes-projeto
<br>
	<h1>Design Patterns by GoF</h1>
<br>
<h1 style="border-top: 5px solid red;">Creational</h1>
<p>- Eles disponibilizam uma maneira para criar objetos ocultando os detalhes da sua criação, ao invés de utilizar o operador new diretamente. Isto dá mais flexibilidade na hora de decidir quais objetos precisam ser criados para um determinado caso</p>
<dl>
  <dt>Singleton</dt>
  <dd>- Intenção: garantir que uma determinada classe tenha uma, e somente uma instância, mantendo um ponto global de acesso para a mesma</dd>
  
  <dt>Factory Method</dt>
  <dd>- Intenção: definir uma interface para criar um objeto, mas deixar as subclasses decidirem que classe instanciar.</dd>
  <dd>- Cria uma instância de várias classes derivadas</dd>
  
  <dt>Abstract Factory</dt>
  <dd>- Intenção: fornecer uma interface para criação de famílias de objetos relacionados ou dependentes sem especificar suas classes concretas</dd>
  <dd>- Cria uma instância de várias famílias de classes</dd>
  
  <dt>Builder</dt>
  <dd>- Intenção: separar a construção de um objeto complexo da sua representação de modo que o mesmo processo de construção possa criar diferentes representações.</dd>
  <dd>- Separa a construção do objeto de sua representação</dd>
  
  <dt>Prototype</dt>
  <dd>- Intenção: especificar os tipos de objetos a serem criados usando uma instância protótipo e criar novos objetos pela cópia deste protótipo</dd>
  <dd>- Uma instância inicializada a ser copiada ou clonada</dd>
</dl>

<h1 style="border-top: 5px solid red;">Structural</h1>
<p>- Eles se preocupam com a composição das classes e seus objetos. O conceito de herança é largamente utilizado para compor interfaces e definir maneiras para compor objetos e obter novas funcionalidades.</p>
<dl>
  <dt>Bridge</dt>
  <dd>- Intenção: desacoplar uma abstração da sua implementação, de modo que as duas possam variar independentemente</dd>
  <dd>- Separa a interface do objeto de sua implementação</dd>
  
  <dt>Adapter</dt>
  <dd>- Intenção: converter a interface de uma classe em outra interface, esperada pelos clientes. O adapter permite que classes com interfaces incompatíveis trabalhem em conjunto o que, de outra forma, seria impossível.</dd>
  <dd>- Equiparar interfaces de diferentes classes</dd>
  
  <dt>Proxy</dt>
  <dd>- Intenção: fornece um substituto (surrogate) ou marcador da localização de outro objeto para controlar o acesso ao mesmo.</dd>
  <dd>- Um objeto representando um outro objeto</dd>
  
  <dt>Decorator</dt>
  <dd>- Intenção: agregar dinamicamente responsabilidades adicionais a um objeto</dd>
  <dd>- Permite adicionar um comportamento ao um objeto já existente em tempo de execução</dd>
  
  <dt>Composite</dt>
  <dd>- Intenção: compor objetos em estruturas de árvore para representarem hierarquias todo-parte</dd>
  
  <dt>Facade</dt>
  <dd>- Intenção: fornecer uma interface unificada para um conjunto de interfaces em um subsistema. Facade define uma interface de nível mais alto que torna o subsistema mais fácil de ser usado</dd>
  <dd>- Uma única classe representa um subsistema inteiro</dd>
  
  <dt>Flyweight</dt>
  <dd>- Intenção: usar compartilhamento para suportar eficientemente grandes quantidades de objetos de granularidade fina</dd>
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