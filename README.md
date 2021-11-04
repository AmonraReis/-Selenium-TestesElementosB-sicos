# Selenium-Testes
Testes Implementados em JAVA

Teste de Desáfio do curso que estou fazendo

O Script irá primeiramente fazer toda a verificação procurando pelos IDs e preenchendo conforme solicita o formulário.
Após o processo, com o AssertTrue e Equals irá confirmar se todos os dados foram preenchidos de forma correta.

Parte do sistema onde fica armazenado as informações e onde é realizado também as verificações 

" Assert.assertTrue(driver.findElement(By.id("resultado")).getText().startsWith("Cadastrado")); //starts with verifica se inicio com cadastrado
       		Assert.assertTrue((driver.findElement(By.id("descNome")).getText()).endsWith("Luiny")); //verifica se terminou com luiny
       		Assert.assertEquals("Sobrenome: Maria", driver.findElement(By.id("descSobrenome")).getText());
       		Assert.assertEquals("Sexo: Feminino", driver.findElement(By.id("descSexo")).getText());
       		Assert.assertEquals("Comida: Pizza", driver.findElement(By.id("descComida")).getText());
       		Assert.assertEquals("Escolaridade: mestrado", driver.findElement(By.id("descEscolaridade")).getText());
       		Assert.assertEquals("Esportes: Futebol", driver.findElement(By.id("descEsportes")).getText());"
          
![alt text](https://github.com/AmonraReis/Selenium-Testes/blob/main/git2.png)


Confirmação sucesso de teste:
![alt text](https://github.com/AmonraReis/Selenium-Testes/blob/main/git.png)

