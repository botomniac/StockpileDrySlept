## Sicone: Sistema Integrado de Controle de Estoque 
<img src="Misc/sicone_logo.png" alt="Sicone" width="120" height="40">

Desenvolvido por [@botomniac](https://github.com/botomniac), [@dekxside](https://github.com/dekxside) e [@otacalado](https://github.com/otacalado).

Documentação disponível na [**wiki**](https://github.com/dekxside/StockpileDrySlept/wiki).

#### Configuração do ambiente para um projeto existente (Windows)

Clone o projeto e abra-o no **EclipseEE**.

##### Configurando o Spring

````

````

##### Configurando o Hibernate


    
------

#### Configuração do ambiente para um novo projeto (Windows)

No **EclipseEE**, crie um projeto **Maven**.

<img src="Misc/g1.jpg" alt="Img1" width="380" height="380">

Na tela de seleção do archetype, escolha *maven-archetype-webapp*.

<img src="Misc/g2.jpg" alt="Img2" width="380" height="380">

Nomeie o **Group Id**, *com.sicone* no nosso caso, e no **Artifact Id** coloque *sicone*. Caso tenha dúvidas quanto ao que colocar nesses campos, veja o [guia de convenção](https://maven.apache.org/guides/mini/guide-naming-conventions.html) do Maven.

<img src="Misc/g3.jpg" alt="Img3" width="380" height="380">

Caso apareça algum erro relacionado a plugins do Maven como o exemplo abaixo, veja a solução [aqui]().
````
Could not calculate build plan: Plugin org.apache.maven.plugins:maven-resources-plugin:2.6 or one of its dependencies could not be resolved: Failed to read artifact descriptor for org.apache.maven.plugins:maven-resources-plugin:jar:2.6
Plugin org.apache.maven.plugins:maven-resources-plugin:2.6 or one of its dependencies could not be resolved: Failed to read artifact descriptor for org.apache.maven.plugins:maven-resources-plugin:jar:2.6
````
