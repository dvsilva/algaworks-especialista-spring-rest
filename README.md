# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 19-48-removendo-modelo-de-representacao-inutilizado-da-documentacao
git add .
git commit -m "Removendo modelo de representação inutilizado da documentação"
git push origin 19-48-removendo-modelo-de-representacao-inutilizado-da-documentacao

git checkout master
git merge --no-ff 19-48-removendo-modelo-de-representacao-inutilizado-da-documentacao
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