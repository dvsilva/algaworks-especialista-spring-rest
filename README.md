# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 07-06-adicionando-flyway-no-projeto-e-criando-primeira-migracao
git add .
git commit -m "Adicionando o Flyway no projeto e criando a primeira migração"
git push origin 07-06-adicionando-flyway-no-projeto-e-criando-primeira-migracao

git checkout master
git merge --no-ff 07-06-adicionando-flyway-no-projeto-e-criando-primeira-migracao
git push

sair da tela de merge
aperte "ESC" depois digite ":wq"
configure other merge tool
git config --global core.editor "'C:/Program Files/Notepad++/notepad++.exe' -multiInst -notabbar -nosession -noPlugin"

// delete branch locally
git branch -d localBranchName

// delete branch remotely
git push origin --delete remoteBranchName
```