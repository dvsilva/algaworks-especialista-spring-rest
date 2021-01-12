# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 12-06-adicionando-endereco-no-modelo-da-representacao-do-recurso-de-restaurante
git add .
git commit -m "Adicionando endereço no modelo da representação do recurso de restaurante"
git push origin 12-06-adicionando-endereco-no-modelo-da-representacao-do-recurso-de-restaurante

git checkout master
git merge --no-ff 12-06-adicionando-endereco-no-modelo-da-representacao-do-recurso-de-restaurante
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