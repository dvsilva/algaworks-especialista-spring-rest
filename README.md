# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 04-34-finalizando-a-atualizacao-parcial-com-a-api-de-reflections-do-spring
git add .
git commit -m "Finalizando a atualização parcial com a API de Reflections do Spring"
git push origin 04-34-finalizando-a-atualizacao-parcial-com-a-api-de-reflections-do-spring

git checkout master
git merge --no-ff 04-34-finalizando-a-atualizacao-parcial-com-a-api-de-reflections-do-spring
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